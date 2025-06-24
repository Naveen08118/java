package shapes;
import java.util.Scanner;
public class Rectangle{

public void Area()
{
Scanner sc=new Scanner(System.in);
System.out.println("please enter length of Rectangle for area of rectangle");
int length1=sc.nextInt();
System.out.println("please enter Breadth of Rectangle for area of rectangle");
int breadth1 =sc.nextInt();
int Area2=length1*breadth1;
System.out.println("Area of Rectangle is="+Area2);

}



public void perimeter(){

Scanner sc=new Scanner(System.in);
System.out.println("please enter length of Rectangle for perimeter");
int length1=sc.nextInt();

System.out.println("please enter Breadth of Rectangle for  perimeter");

int breadth1 =sc.nextInt();

int perimeter1=2*length1*breadth1;
System.out.println("perimeter1 of Rectangle is="+perimeter1);


}

}






