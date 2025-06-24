package shapes;
import java.util.Scanner;
public class Circle{
double PI=3.145;

public void area(){
Scanner sc=new Scanner(System.in);
System.out.println("please enter radius for area of circle");
double radius1=sc.nextDouble();
double Area1=PI*radius1*radius1;
System.out.println("Area of circle is="+Area1);

}
public void perimeter(){
Scanner sc=new Scanner(System.in);
System.out.println("please enter radius for perimeter of circle");
double radius2=sc.nextDouble();
double perimeter1=2*PI*radius2;
System.out.println("perimeter1 of circle is="+perimeter1);



}

}
