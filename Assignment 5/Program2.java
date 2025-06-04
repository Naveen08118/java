//using constructors(default)


//2.Define a class named Employee with following fields:
//empID, empName, deptID, bloodGroup, salary.
//Define following methods:
//Employee():default constructor To read employee data.
//printEmployeeDetails(): To display employee data.



import java.util.Scanner;

class Employee{

String empID;
String empName;
String deptID;
String bloodGroup;
double salary;
/**
parameterised constructor
Employee(String empID1,String empName1,String bloodGroup1,double salary1)
{

empID=nam;
empName=marks1;
deptID=marks2;
bloodGroup=marks3;
salary=salary1
}*/

//default constructor 

Employee()
{

System.out.println("please enter empID");
Scanner sc=new Scanner(System.in);
empID=sc.nextLine();

System.out.println("please enter employee Name");
empName=sc.nextLine();

System.out.println("please enter departement ID");
deptID=sc.nextLine();

System.out.println("please enter bloodGroup");
bloodGroup=sc.nextLine();

System.out.println("please enter salary");
salary=sc.nextDouble();

}


/** public void gettotal(){

total=(mark1+mark2+mark3);
System.out.println(total);

}*/

public void printEmployeeDetails(){

System.out.println("entered empID="+ empID);
System.out.println("entered employee Name="+ empName);
System.out.println("entered departement ID="+ deptID);
System.out.println("entered bloodGroup="+ bloodGroup);
System.out.println("entered salary="+ salary);

}

}


public  class Program2{



public static void main(String...k)
{

Employee empdetails=new Employee();//using default constructor
empdetails.printEmployeeDetails();


}
}