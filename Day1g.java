//7.WAP to compute quotient and reminder of given number.

import java.util.*;

class Day1g{

static public void main(String[] args)
{


Scanner sc=new Scanner(System.in);
System.out.println("enter number1");
int a1 =sc.nextInt();
System.out.println("enter number2");
int a2 =sc.nextInt();
int quotient=a1/a2;
int reminder=a1%a2;
System.out.println("the quotient of a number=" + quotient);
System.out.println("the reminder of a number=" + reminder);



}
}