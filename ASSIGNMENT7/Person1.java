//Assignment 2: Multilevel Inheritance - Employee Salary Calculation

import java.util.Scanner;

class Person{

public String name;
public int age;
public void Person(){
System.out.println("enter the name of employee");
Scanner sc =new Scanner(System.in);
this.name=sc.nextLine();
//name=name1;

System.out.println("enter the age of employee");
//Scanner sc =new Scanner(System.in);
this.age=sc.nextInt();
//age=age1;
}

}

class Employee extends Person{

public int empId;
public String department;

public void Employee(){

System.out.println("enter the employee_ID");
Scanner sc =new Scanner(System.in);
this.empId=sc.nextInt();
System.out.println("enter the department of employee");
Scanner sc1 =new Scanner(System.in);

this.department=sc1.nextLine();
}


}

class Salary extends Employee{
public double basicPay;
public double HRA;
public  double DA;
public double total_salary;


public void calculateSalary(){

System.out.println("please enter basic pay");
Scanner sc=new Scanner(System.in);
this.basicPay=sc.nextDouble();

 double hraPercentage = 0.10; // 10% HRA
 double daPercentage = 0.05; // 5% DA

        double HRA = basicPay * hraPercentage;
        double DA = basicPay * daPercentage;
        this.total_salary = basicPay + HRA + DA;

        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("total Salary: " + total_salary);

}

void display()
{
Person pr=new Person();
pr.Person();
System.out.println(pr.name);

Employee emp=new Employee();
emp.Employee();

calculateSalary();


System.out.println("The name of employee="+ pr.name);
System.out.println("The age of employee="+ pr.age);
System.out.println("the employee_ID is="+emp.empId);
System.out.println("the department of employee is ="+emp.department);

System.out.println("total Salary: " + total_salary);
}




}

class Person1{

public static void main(String...k){
Salary sal=new Salary();
sal.display();




}

}

