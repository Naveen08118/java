//9.WAP to calculate the area of circle and triangle.

import java.util.*;

class Day1k{

static public void main(String[] args)
{


Scanner sc=new Scanner(System.in);
System.out.println("enter radius of circle");
int radius =sc.nextInt();
double pi=3.14;
double Area=(pi*radius*radius);
System.out.println("the area of circle is=" + Area);
System.out.println("enter Breadth of Triangle");
int breadth=sc.nextInt();
System.out.println("enter height of Traingle");
int height=sc.nextInt();
int AreaT=(breadth*height)/2;
System.out.println("the area of Triangle is=" + AreaT);



}
}