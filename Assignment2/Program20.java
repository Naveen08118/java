//19.WAP to accept a grade and declare the equivalent description.

import java.util.Scanner;

class Program20{

public static void main(String...k)
{
String shape[]={"1.circle","2.rectangle","3.Square","4.Triangle"};

for (String number : shape){

System.out.println(number);
}
System.out.println("please give selection 1,2,3 any one only");
Scanner sc=new Scanner(System.in);
String character=sc.next();
char shapeselection = character.charAt(0);
switch(shapeselection){



case '1': double pi=3.145;
	System.out.println("enter radius of circle");
         int radius=sc.nextInt();
	double Area=(pi*radius*radius);	
         System.out.println(" Area of circle ="+ Area);break;
case '2':System.out.println("enter Length of Rectangle");
         int length=sc.nextInt();
		System.out.println("enter Breadth of Rectangle");
         int Breadth=sc.nextInt();
		double areaofRectangle=(length*Breadth);
	 System.out.println(" Area of Rectangle ="+ areaofRectangle);break;

case '3':System.out.println("enter side of Square");
         int side=sc.nextInt();
	double areaofSquare=(side*side);
	 System.out.println(" Area of Square ="+ areaofSquare);break;

case '4':System.out.println("enter base of a Triangle");
         int base=sc.nextInt();
		System.out.println("enter height of a Triangle");
         int height=sc.nextInt();
		double areaofTriangle=(base*height);
	 System.out.println(" Area of Triangle ="+ areaofTriangle);break;

default:System.out.println("please enter correct Selection for calculating Area");break;
}}}
