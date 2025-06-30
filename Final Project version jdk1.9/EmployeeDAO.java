
package com.bts.dao;

import com.bts.model.Employee;
import com.bts.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public void addEmployee(Employee emp) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO Employee VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, emp.getEmpCode());
            ps.setString(2, emp.getEmpName());
            ps.setString(3, emp.getEmpEmail());
            ps.setString(4, emp.getEmpPassword());
            ps.setString(5, emp.getGender());
            ps.setString(6, emp.getDob());
            ps.setLong(7, emp.getMobileNo());
            ps.setString(8, emp.getRole());
            ps.executeUpdate();
            System.out.println("Employee added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding employee: " + e.getMessage());
        }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM Employee";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmpCode(rs.getInt("empCode"));
                emp.setEmpName(rs.getString("empName"));
                emp.setEmpEmail(rs.getString("empEmail"));
                emp.setEmpPassword(rs.getString("empPassword"));
                emp.setGender(rs.getString("gender"));
                emp.setDob(rs.getString("DOB"));
                emp.setMobileNo(rs.getLong("mobileNo"));
                emp.setRole(rs.getString("Role"));
                list.add(emp);
            }
        } catch (Exception e) {
            System.out.println("Error fetching employees: " + e.getMessage());
        }
        return list;
    }
}
