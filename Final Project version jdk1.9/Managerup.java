import java.util.*;
import java.sql.*;
//import DBConnection.*;


public class Managerup{


 static void connectDB() throws SQLException {
      Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/BDS", "root", "123");
    }




public static void managerPanel(Scanner sc, Connection conn)throws Exception {
Managerup mp=new Managerup();

mp.connectDB();    

while (true) {
        System.out.println("\n=== Manager Panel ===");
        System.out.println("1. View All Bugs");
        System.out.println("2. View Bugs by Status");
        System.out.println("3. View Team Performance");
        System.out.println("4. Exit to Main Menu");
        System.out.print("Enter choice: ");
connectDB();

//Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 :viewBugs(conn);
            case 2 : viewBugsByStatus(sc,conn);
            case 3 : viewTeamPerformance(conn);
            case 4 : { return; }
            default : System.out.println("Invalid option.");
        }
    }
}





static void viewBugs(Connection conn) {
    String sql = "SELECT bugNo, bugCode, projectID, TCode, ECode, status, bugDes FROM BugReport";

    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        System.out.printf("%-6s %-8s %-10s %-6s %-6s %-10s %s%n",
            "No", "Code", "ProjID", "TCode", "ECode", "Status", "Description");
        System.out.println("----------------------------------------------------------------------------");

        boolean found = false;
        while (rs.next()) {
            found = true;
            System.out.printf("%-6d %-8d %-10d %-6d %-6d %-10s %s%n",
                rs.getInt("bugNo"),
                rs.getInt("bugCode"),
                rs.getInt("projectID"),
                rs.getInt("TCode"),
                rs.getInt("ECode"),
                rs.getString("status"),
                rs.getString("bugDes"));
        }

        if (!found) {
            System.out.println("No bugs found.");
        }

    } catch (SQLException e) {
        System.err.println("Error fetching bug reports: " + e.getMessage());
    }
}









static void viewBugsByStatus(Scanner sc, Connection conn) {
    System.out.print("Enter status to filter (pending/resolved): ");
    String status = sc.nextLine().trim();
    String sql = "SELECT bugNo, bugCode, projectID, TCode, ECode, status, bugDes "
               + "FROM BugReport WHERE status = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, status);
        try (ResultSet rs = ps.executeQuery()) {
            System.out.println("Bugs with status = " + status + ":");
            while (rs.next()) {
                System.out.printf("Bug %d | Code %d | Proj %d | Tester %d | Dev %d | %s | %s%n",
                    rs.getInt("bugNo"), rs.getInt("bugCode"), rs.getInt("projectID"),
                    rs.getInt("TCode"), rs.getInt("ECode"), rs.getString("status"), rs.getString("bugDes"));
            }
        }
    } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
    }
}

static void viewTeamPerformance(Connection conn) {
    String sql = "SELECT ECode AS emp, "
               + "SUM(CASE WHEN status='resolved' THEN 1 ELSE 0 END) AS resolved_count, "
               + "SUM(CASE WHEN status='pending' THEN 1 ELSE 0 END) AS pending_count "
               + "FROM BugReport GROUP BY ECode";
    try (PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        System.out.println("Team performance (by developer):");
        while (rs.next()) {
            System.out.printf("Dev %d => Resolved: %d, Pending: %d%n",
                rs.getInt("emp"), rs.getInt("resolved_count"), rs.getInt("pending_count"));
        }
    } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
    }
}
}