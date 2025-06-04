//using constructors(default)


//1.Create a class as student with members:
//data members : rollno, name, mark1, mark2, mark3, total and average.
//member functions: gettotal(),getdata() and displaydata().
//
//gettotal(): Return the total marks 
//getdata() method used to get the student details.
//displaydata() method used to display the student details.



import java.util.Scanner;

class Student{

int rollno;
String name;
int mark1;
int mark2;
int mark3;
double total;
double average;
/**

Student(String nam,int marks1,int marks2,int marks3)
{

name=nam;
mark1=marks1;
mark2=marks2;
mark3=marks3;

}*/

//default constructor 

Student()
{

System.out.println("please enter name");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();

System.out.println("please enter marks1");
mark1=sc.nextInt();

System.out.println("please enter marks2");
mark2=sc.nextInt();

System.out.println("please enter marks3");
mark3=sc.nextInt();

}

public void gettotal(){

total=(mark1+mark2+mark3);
System.out.println(total);

}

public void displaydata(){

System.out.println("entered name="+ name);
System.out.println("entered mark1"+ mark1);
System.out.println("entered mark2"+ mark2);
System.out.println("entered mark3"+ mark3);
System.out.println("sum of total"+ total);
System.out.println("Final Average"+ average);
}
public void average1(){

average=(total)/3;
System.out.println(average);
}

}


public  class Program1{



public static void main(String...k)
{

Student stu=new Student();//using default constructor
stu.gettotal();
stu.average1();
stu.displaydata();

}
}