//2.WAP to add, subtract two numbers with or without there corresponding operator.

import java.util.*;

class Day1b{

static public void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int first =sc.nextInt();
System.out.println("enter second number");
int second=sc.nextInt();
int addition=(first + second);
System.out.println("The number after addation is"+ addition);
int subtract=(first-second);
System.out.println("The number after subtraction"+ subtract);
}
}