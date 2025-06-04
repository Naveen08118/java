
//Assignment 6: Employee Profile


class Employee {

String Employee_ID;
String name;
double salary;

void Employee(String EmployeeID1){
Employee_ID=EmployeeID1;
System.out.println("Employee_ID= "+Employee_ID);


}
void Employee(String EmployeeID1,String name1)
{
String Employee_ID=EmployeeID1;
String name=name1;
System.out.println("Employee_ID= "+Employee_ID+" " +"name ="+name);
}
void Employee(String EmployeeID1,String name1,double salary1)
{
String Employee_ID=EmployeeID1;
String name=name1;
double salary=salary1;
System.out.println("Employee_ID= "+Employee_ID +" "+ "name= "+name+" "+"salary= "+salary);

}

public static void main(String...k){

Employee emp=new Employee();
emp.Employee("04folao4a4","v n kumar somisetty",65000);
emp.Employee("0445olao4a4","venakata naveen");
emp.Employee("0543FROIJ");

}

}