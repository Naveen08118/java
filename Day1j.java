//10.Take a 4 digit number as a input from the user and WAP to perform the addition of first and last digits //without using loop. (n=4263 result=4+3=7)

import java.util.*;

class Day1j{

static public void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 4 digit number");
int fourdigit =sc.nextInt();
int d4=(fourdigit%10);

int d3=((fourdigit/10)%10);
int d2=((fourdigit/100)%10);
int d1=(fourdigit/1000);
int addednumber=(d4+d1);
System.out.println("the final Addation first and fourth digit of a given four digit number is="+ addednumber);


}
}