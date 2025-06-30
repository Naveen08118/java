// EmployeeDAO.java
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;










public class EmployeeDAO1 {
EmployeeDAO1()throws Exception{
Scanner sc=new Scanner(System.in);
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDS", "root", "123");

}

static void employeePanel(Scanner sc, Connection conn) {
//Scanner sc=new Scanner(System.in);
//Class.forName("com.mysql.jdbc.Driver");
//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDS", "root", "123");









    while (true) {
        System.out.println("\nEmployee Panel");
System.out.println("1. Update Profile");
        System.out.println("2. Add Bug (Tester Only)");
        System.out.println("3. Update Bug status");
        System.out.println("4. View Bugs");
        System.out.println("5. Bug Detail");
        System.out.println("6. Back");
        switch (sc.nextInt()) {
case 1:updateProfile(sc,conn,123);
            case 2 : addBug(sc, conn);
            case 3 : updateBugStatus(sc, conn);
            case 4 : viewBugs(conn);
            case 5 : viewBugDetail(sc, conn);
            case 6 : { sc.nextLine(); return; }
        }
        sc.nextLine();
    }
}


public static void viewBugs(Connection conn) {
    String sql = "SELECT bugNo, bugCode, projectID, TCode, ECode, status, bugDes FROM BugReport";

    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        System.out.println("\n=== Bug List ===");
        while (rs.next()) {
            int bugNo = rs.getInt("bugNo");
            int bugCode = rs.getInt("bugCode");
            int projectID = rs.getInt("projectID");
            int testerCode = rs.getInt("TCode");
            int empCode = rs.getInt("ECode");
            String status = rs.getString("status");
            String bugDes = rs.getString("bugDes");

            System.out.println("Bug No     : " + bugNo);
            System.out.println("Bug Code   : " + bugCode);
            System.out.println("Project ID : " + projectID);
            System.out.println("Tester Code: " + testerCode);
            System.out.println("Employee   : " + empCode);
            System.out.println("Status     : " + status);
            System.out.println("Description: " + bugDes);
            System.out.println("----------------------------");
        }

    } catch (SQLException e) {
        System.out.println("Error retrieving bugs: " + e.getMessage());
    }
}








    public static void updateBugStatus(Scanner sc, Connection conn) {
    System.out.print("Enter Bug Number to update: ");
    int bugNo = sc.nextInt();
    sc.nextLine(); // consume newline

    System.out.print("Enter new status (pending/resolved): ");
    String newStatus = sc.nextLine().trim().toLowerCase();

    if (!newStatus.equals("pending") && !newStatus.equals("resolved")) {
        System.out.println("Invalid status. Please enter 'pending' or 'resolved'.");
        return;
    }

    String sql = "UPDATE BugReport SET status = ? WHERE bugNo = ?";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, newStatus);
        pstmt.setInt(2, bugNo);

        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            System.out.println("Bug status updated successfully.");
        } else {
            System.out.println("No such bug found with bug number: " + bugNo);
        }
    } catch (SQLException e) {
        System.out.println("Error updating bug status: " + e.getMessage());
    }
}



static void updateProfile(Scanner sc, Connection conn, int empCode) {
    System.out.print("Enter new name: ");
    String name = sc.nextLine();
    System.out.print("Enter new email: ");
    String email = sc.nextLine();
    System.out.print("Enter new mobile number: ");
    long mobile = sc.nextLong();
    sc.nextLine(); // consume newline

    String sql = "UPDATE Employee SET empName = ?, empEmail = ?, mobileNo = ? WHERE empCode = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setLong(3, mobile);
        ps.setInt(4, empCode);

        if (ps.executeUpdate() > 0) {
            System.out.println("Profile updated successfully.");
        } else {
            System.out.println("Error: Profile not updated.");
        }
    } catch (SQLException e) {
        System.err.println("SQL error updating profile: " + e.getMessage());
    }
}







static void viewBugDetail(Scanner sc, Connection conn) {
    System.out.print("Enter bug number (bugNo): ");
    int bugNo = sc.nextInt();
    sc.nextLine();

    String sql = "SELECT br.bugNo, bt.bugCatgory, bt.bugSeverty, p.projectName, br.status, " +
                 "br.bugDes, et.empName AS testerName, ed.empName AS devName " +
                 "FROM BugReport br " +
                 "JOIN BugType bt ON br.bugCode = bt.bugCode " +
                 "JOIN Project p ON br.projectID = p.projectID " +
                 "LEFT JOIN Employee et ON br.TCode = et.empCode " +
                 "LEFT JOIN Employee ed ON br.ECode = ed.empCode " +
                 "WHERE br.bugNo = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, bugNo);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                System.out.println("Bug No: " + rs.getInt("bugNo"));
                System.out.println("Type: " + rs.getString("bugCatgory"));
                System.out.println("Severity: " + rs.getString("bugSeverty"));
                System.out.println("Project: " + rs.getString("projectName"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("Description: " + rs.getString("bugDes"));
                System.out.println("Tester: " + rs.getString("testerName"));
                System.out.println("Assigned Dev: " + rs.getString("devName"));
            } else {
                System.out.println("No bug found with bugNo = " + bugNo);
            }
        }
    } catch (SQLException e) {
        System.err.println("SQL error fetching details: " + e.getMessage());
    }
}



public static void addBug(Scanner sc, Connection conn) {
    try {
        // Collect user input
        System.out.print("Enter Bug Number (bugNo): ");
        int bugNo = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Bug Code (bugCode, refer BugType table): ");
        int bugCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Project ID (projectID): ");
        int projectID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Tester Code (TCode): ");
        int TCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Code (ECode): ");
        int ECode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bug Status (pending/resolved): ");
        String status = sc.nextLine().trim().toLowerCase();

        // Validate status
        if (!status.equals("pending") && !status.equals("resolved")) {
            System.out.println("Invalid status. Must be 'pending' or 'resolved'.");
            return;
        }

        System.out.print("Enter Bug Description: ");
        String bugDes = sc.nextLine();

        // MySQL INSERT query
        String sql = "INSERT INTO BugReport (bugNo, bugCode, projectID, TCode, ECode, status, bugDes) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        // Execute using PreparedStatement
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, bugNo);
            pstmt.setInt(2, bugCode);
            pstmt.setInt(3, projectID);
            pstmt.setInt(4, TCode);
            pstmt.setInt(5, ECode);
            pstmt.setString(6, status);
            pstmt.setString(7, bugDes);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Bug added successfully.");
            } else {
                System.out.println(" Bug insertion failed.");
            }
        }

    } catch (SQLException e) {
        System.out.println("SQL Error: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Input Error: " + e.getMessage());
        sc.nextLine(); // clear buffer in case of bad input
    }
}}















/**
static void addBug(Scanner sc, Connection conn) {
    try {
        System.out.print("Enter bugNo: ");
        int bugNo = sc.nextInt();
        System.out.print("Enter bugType code (bugCode): ");
        int bugCode = sc.nextInt();
        System.out.print("Enter projectID: ");
        int projectID = sc.nextInt();
        System.out.print("Enter your tester code (TCode): ");
        int tCode = sc.nextInt();
        System.out.print("Enter assigned dev code (ECode): ");
        int eCode = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter status (pending/resolved): ");
        String status = sc.nextLine().trim();
        System.out.print("Enter bug description: ");
        String bugDes = sc.nextLine();

        String sql = "
            INSERT INTO BugReport
            (bugNo, bugCode, projectID, TCode, ECode, status, bugDes)
            VALUES (?, ?, ?, ?, ?, ?, ?)");

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, bugNo);
            ps.setInt(2, bugCode);
            ps.setInt(3, projectID);
            ps.setInt(4, tCode);
            ps.setInt(5, eCode);
            ps.setString(6, status);
            ps.setString(7, bugDes);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Bug report added successfully.");
            } else {
                System.out.println(" Failed to add bug report.");
            }
        }
    } catch (SQLException e) {
        System.err.println("SQL error while adding bug: " + e.getMessage());
    } catch (InputMismatchException e) {
        System.err.println("Invalid input. Please enter data in the correct format.");
        sc.nextLine(); // clear scanner bad input
    }
}



*/











/**

    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO Employee (empCode, empName, empEmail, empPassword, gender, DOB, mobileNo, Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, emp.getEmpCode());
            pstmt.setString(2, emp.getEmpName());
            pstmt.setString(3, emp.getEmpEmail());
            pstmt.setString(4, emp.getEmpPassword());
            pstmt.setString(5, emp.getGender());
            pstmt.setString(6, emp.getDOB());
            pstmt.setLong(7, emp.getMobileNo());
            pstmt.setString(8, emp.getRole());
            pstmt.executeUpdate();
            System.out.println("Employee added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(Employee emp) {
        String sql = "UPDATE Employee SET empName=?, empEmail=?, empPassword=?, gender=?, DOB=?, mobileNo=?, Role=? WHERE empCode=?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, emp.getEmpName());
            pstmt.setString(2, emp.getEmpEmail());
            pstmt.setString(3, emp.getEmpPassword());
            pstmt.setString(4, emp.getGender());
            pstmt.setString(5, emp.getDOB());
            pstmt.setLong(6, emp.getMobileNo());
            pstmt.setString(7, emp.getRole());
            pstmt.setInt(8, emp.getEmpCode());
            pstmt.executeUpdate();
            System.out.println("Employee updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int empCode) {
        String sql = "DELETE FROM Employee WHERE empCode = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, empCode);
            pstmt.executeUpdate();
            System.out.println("Employee deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee getEmployee(int empCode) {
        String sql = "SELECT * FROM Employee WHERE empCode = ?";
        Employee emp = null;

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, empCode);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                emp = new Employee();
                emp.setEmpCode(rs.getInt("empCode"));
                emp.setEmpName(rs.getString("empName"));
                emp.setEmpEmail(rs.getString("empEmail"));
                emp.setEmpPassword(rs.getString("empPassword"));
                emp.setGender(rs.getString("gender"));
                emp.setDOB(rs.getString("DOB"));
                emp.setMobileNo(rs.getLong("mobileNo"));
                emp.setRole(rs.getString("Role"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM Employee";

        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmpCode(rs.getInt("empCode"));
                emp.setEmpName(rs.getString("empName"));
                emp.setEmpEmail(rs.getString("empEmail"));
                emp.setEmpPassword(rs.getString("empPassword"));
                emp.setGender(rs.getString("gender"));
                emp.setDOB(rs.getString("DOB"));
                emp.setMobileNo(rs.getLong("mobileNo"));
                emp.setRole(rs.getString("Role"));
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
*/