//2.)completed

import java.util.Scanner; 
class Employee {
    double empID;
    String empName;
    String deptID;
    String bloodGroup;
    int salary;
  

    

    //Method to set the Employee data
    public void setEmployeeDetails()
    {

System.out.println("please enter employee id");
Scanner sc =new Scanner(System.in);
empID=sc.nextDouble();
System.out.println("please enter employee name ");
empName=sc.nextLine();
    empName=sc.nextLine();
 System.out.println("please enter Departement ID ");
deptID=sc.nextLine();
 
System.out.println("please enter BLOOD GROUP ");
bloodGroup=sc.nextLine();
 
System.out.println("please enter SALARY OF EMPLOYEE ");

salary=sc.nextInt();
 
    }
    

    //Method to display the Employee data
    public void displayData() {
        System.out.println("Employee ID" + empID);
        System.out.println("empName: " + empName);
        System.out.println("departementID 1: " + deptID);
        System.out.println("bloodGroup: " + bloodGroup);
        System.out.println("salary: " + salary);
        }
}



class Program2{
public static void main(String...k){
Employee emp=new Employee();
    emp.setEmployeeDetails();
emp.displayData();



}}