
package com.bts.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/BDS";
    private static final String USER = "root";
    private static final String PASSWORD = "123";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Connection Error: " + e.getMessage());
            return null;
        }
    }
}




    import java.sql.*;

    public class BugDAO { // Data Access Object
        public void addBug(String title, String description, String status, String priority) throws SQLException {
            String sql = "INSERT INTO bugs (title, description, status, priority, reported_date) VALUES (?, ?, ?, ?, NOW())";
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, title);
                stmt.setString(2, description);
                stmt.setString(3, status);
                stmt.setString(4, priority);
                stmt.executeUpdate();
            }
        }

        public ResultSet getAllBugs() throws SQLException {
            String sql = "SELECT * FROM bugs";
            Connection conn = null;
            Statement stmt = null;
            try {
                conn = DatabaseConnection.getConnection();
                stmt = conn.createStatement();
                return stmt.executeQuery(sql);
            } catch (SQLException e) {
                // Handle exception
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                throw e;
            }
        }

        // Add methods for updateBug, deleteBug, getBugById, etc.
    }