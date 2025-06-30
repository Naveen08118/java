
package com.bts.ui;

import com.bts.dao.EmployeeDAO;
import com.bts.model.Employee;

import java.util.List;
import java.util.Scanner;

public class AdminUI {
    private static Scanner sc = new Scanner(System.in);
    private static EmployeeDAO empDAO = new EmployeeDAO();

    public static void showMenu() {
        int choice;
        do {
            System.out.println("\n--- Admin Panel ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1 : addEmployee();
                case 2 : viewEmployees();
                case 3 : System.out.println("Exiting Admin Panel...");
                default : System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    private static void addEmployee() {
        Employee emp = new Employee();
        System.out.print("Enter empCode: ");
        emp.setEmpCode(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Name: ");
        emp.setEmpName(sc.nextLine());
        System.out.print("Enter Email: ");
        emp.setEmpEmail(sc.nextLine());
        System.out.print("Enter Password: ");
        emp.setEmpPassword(sc.nextLine());
        System.out.print("Enter Gender: ");
        emp.setGender(sc.nextLine());
        System.out.print("Enter DOB: ");
        emp.setDob(sc.nextLine());
        System.out.print("Enter Mobile No: ");
        emp.setMobileNo(sc.nextLong());
        sc.nextLine();
        System.out.print("Enter Role: ");
        emp.setRole(sc.nextLine());

        empDAO.addEmployee(emp);
    }

    private static void viewEmployees() {
        List<Employee> list = empDAO.getAllEmployees();
        for (Employee emp : list) {


           System.out.println(emp.getEmpCode());


           System.out.println(emp.getEmpName());


           System.out.println(emp.getEmpEmail());


           System.out.println(emp.getRole());






           System.out.println(emp.getEmpCode());

        }
    }
}
