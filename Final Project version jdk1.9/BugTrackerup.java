
import java.util.*;
import java.sql.*;


class Bug {
    private int bugNo;
    private int bugCode;     // type/Severity reference
    private int projectID;
    private int tCode;       // Tester code
    private int eCode;       // Assigned developer code
    private String status;   // "Pending" or "Resolved"
    private String description;

    // Getters, setters, constructor omitted for brevity
}

public class BugTrackerup {
    private static Connection conn;

    public static void bugs_code() throws Exception {
        connectDB();
        showMenu();
    }

    static void connectDB() throws SQLException {
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/BDS", "root", "123");
    }

    static void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Bug");
            System.out.println("2. View All Bugs");
            System.out.println("3. Update Bug Status");
            System.out.println("4. Delete Bug");
            System.out.println("5. Exit");
System.out.println("please enter your choice");            
int ch = sc.nextInt();
            switch(ch) {
                case 1: addBug(sc,conn); break;
                case 2: viewBugs(conn); break;
                case 3: updateBugStatus(sc,conn); break;
                case 4: deleteBug(sc,conn); break;
                case 5: System.exit(0);
            }
        }
    }
/**
    static void addBug(Scanner sc) {
        // prompt inputs, then:
        String sql = "INSERT INTO BugReport(bugNo, bugCode, projectID, TCode, ECode, status, bugDes) VALUES (?, ?, ?, ?, ?, ?, ?)";






        // Prepare, set parameters, execute
    }
*/


static void addBug(Scanner sc, Connection conn) {
    System.out.print("Enter bug number (bugNo): ");
    int bugNo = sc.nextInt();
    System.out.print("Enter bug type code (bugCode): ");
    int bugCode = sc.nextInt();
    System.out.print("Enter project ID: ");
    int projectID = sc.nextInt();
    System.out.print("Enter tester code (TCode): ");
    int tCode = sc.nextInt();
    System.out.print("Enter assigned employee code (ECode): ");
    int eCode = sc.nextInt();
    sc.nextLine(); // consume line
    System.out.print("Enter status (pending/resolved): ");
    String status = sc.nextLine();
    System.out.print("Enter bug description: ");
    String bugDes = sc.nextLine();

    String sql = "INSERT INTO BugReport(bugNo, bugCode, projectID, TCode, ECode, status, bugDes) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?)";

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
            System.out.println("Error: Bug report not added.");
        }
    } catch (SQLException e) {
        System.err.println("SQL error: " + e.getMessage());
    }
}

/**

static void viewBugs(Connection conn) {
    String sql = "SELECT bugNo, bugCode, projectID, TCode, ECode, status, bugDes FROM BugReport";

    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
//
        System.out.printf("%-6s %-8s %-10s %-6s %-6s %-10s %s%n",
  //          "No", "Code", "ProjectID", "TCode", "ECode", "Status", "Description");
        System.out.println("------------------------------------------------------------------------------");

        while (rs.next()) {
            int bugNo = rs.getInt("bugNo");
            int bugCode = rs.getInt("bugCode");
            int projectID = rs.getInt("projectID");
            int tCode = rs.getInt("TCode");
            int eCode = rs.getInt("ECode");
            String status = rs.getString("status");
            String bugDes = rs.getString("bugDes");

            System.out.println(  bugNo +"\t" bugCode +"\t" projectID+"\t" tCode+"\t" eCode+"\t" status+"\t" bugDes);
        

}
    } catch (SQLException e) {
        System.err.println("Error fetching bug reports: " + e.getMessage());
    }
}

*/




static void viewBugs(Connection conn) {
    String sql = "SELECT bugNo, bugCode, projectID, TCode, ECode, status, bugDes FROM BugReport";

    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        // Print header
        System.out.printf("%-6s %-8s %-10s %-6s %-6s %-10s %s%n",
            "No", "Code", "ProjID", "TCode", "ECode", "Status", "Description");
        System.out.println("----------------------------------------------------------------------------");

        // Check if the result set is empty first
        if (!rs.next()) {
            System.out.println("No bugs found.");
            return;
        }

        // Process the first row and then iterate through the rest
        do {
            int bugNo     = rs.getInt("bugNo");
            int bugCode   = rs.getInt("bugCode");
            int projectID = rs.getInt("projectID");
            int tCode     = rs.getInt("TCode");
            int eCode     = rs.getInt("ECode");
            String status = rs.getString("status");
            String bugDes = rs.getString("bugDes");

            System.out.printf("%-6d %-8d %-10d %-6d %-6d %-10s %s%n",
                bugNo, bugCode, projectID, tCode, eCode, status, bugDes);
        } while (rs.next());

    } catch (SQLException e) {
        System.err.println("Error fetching bug reports: " + e.getMessage());
    }
}




static void updateBugStatus(Scanner sc, Connection conn) {
    System.out.print("Enter bug number (bugNo) to update: ");
    int bugNo = sc.nextInt();
    sc.nextLine(); // consume newline
    System.out.print("Enter new status (pending/resolved): ");
    String status = sc.nextLine().trim();

    String sql = "UPDATE BugReport SET status = ? WHERE bugNo = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, status);
        ps.setInt(2, bugNo);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("Bug status updated successfully.");
        } else {
            System.out.println("No bug found with bugNo = " + bugNo);
        }
    } catch (SQLException e) {
        System.err.println("SQL error during update: " + e.getMessage());
    }
}




static void deleteBug(Scanner sc, Connection conn) {
    System.out.print("Enter bug number (bugNo) to delete: ");
    int bugNo = sc.nextInt();
    sc.nextLine(); // Consume leftover newline

    String sql = "DELETE FROM BugReport WHERE bugNo = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, bugNo);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("Bug report deleted successfully.");
        } else {
            System.out.println("No bug found with bugNo = " + bugNo);
        }
    } catch (SQLException e) {
        System.err.println("SQL error during delete: " + e.getMessage());
    }
}






}