//package com.bts.util.DBConnection;
import com.bts.ui.AdminUI;
//import java.DBConnection.*;
import java.util.*;
//import java.Managerup.*;
import java.sql.*;

public class Main {




			 public static void connectDB() throws Exception {

Class.forName("com.mysql.jdbc.Driver");



      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDS", "root", "123");
    }

    public static void main(String[] args) throws Exception{
        
Class.forName("com.mysql.jdbc.Driver");



      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDS", "root", "123");

Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bug Tracking System");
        System.out.println("Enter role (admin/manager/employee/bugtest): ");
        String role = sc.nextLine().trim().toLowerCase();

       switch (role) {
            case "admin" : AdminUI.showMenu();break;
            //default : System.out.println("Invalid role or module not implemented yet.");

case "bugtest" : BugTrackerup  btu=new BugTrackerup();
				btu.bugs_code();
//            default : System.out.println("Invalid role or module not implemented yet.");



case "manager" : Managerup  mup=new Managerup();
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDS", "root", "123");
				//btu.bugs_code();
				mup.managerPanel(sc,conn);
break;





         //default : System.out.println("Invalid role or module not implemented yet.");



case "employee" :



		//Connection conn;
				//btu.bugs_code();
Main.connectDB();
 EmployeeDAO1  empda1=new EmployeeDAO1();

		empda1.employeePanel(sc,conn);
			
break;
        
 default : System.out.println("Invalid role or module not implemented yet.");





}






       
}
}


