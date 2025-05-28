//3.WAP to swap two values of 2 no.

import java.util.*;

class Day1c{

static public void main(String[] args)
{


Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int a =sc.nextInt();
System.out.println("enter second number");
int b=sc.nextInt();


int temp = a;
        a = b;
        b = temp;



System.out.println("The number after swapping firstnumber is =" + a +"then second number is value =" + b);

}
}