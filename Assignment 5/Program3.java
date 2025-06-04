//using constructors(default)

import java.util.Scanner;
class Area{
final double PI=3.145;
public double radius;
//default constructor 
Area()
{
System.out.println("please enter Radius ");
Scanner sc=new Scanner(System.in);
radius=sc.nextDouble();
}

public void areaOfCircle(){
//System.out.println("AREA OF CIRCLE="+ radius);
double area3=(PI * radius * radius);
System.out.println("AREA OF CIRCLE="+ area3);
}

public void areaOfCylinder (){
System.out.println("Please enter height of cylinder");
Scanner sc=new Scanner(System.in);
double height=sc.nextDouble();
double area1=2*(PI* radius * radius);
double area2=2*(PI * radius * height);
double area=(area1+area2);
System.out.println("AREA OF CYLINDER="+ area);
} 
}


public class Program3
{
public static void main(String...k)
{
Area areadetails=new Area();//using default constructor
areadetails.areaOfCircle();
areadetails.areaOfCylinder();

}
}