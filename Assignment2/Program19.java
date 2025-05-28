//19.WAP to accept a grade and declare the equivalent description.

import java.util.Scanner;

class Program19{

public static void main(String...k)
{
Scanner sc=new Scanner(System.in);
String character=sc.next();
char grade = character.charAt(0);
switch(grade){
case 'E':System.out.println(" you entered grade=  Excellent");break;
case 'V':System.out.println(" you entered grade=  Very Good");break;
case 'G':System.out.println(" you entered grade= Good");break;
case 'A':System.out.println(" you entered grade= Average");break;
case 'F':System.out.println(" you entered grade=Fail");break;
default:System.out.println("please enter correct grade in capital letters  ");break;
}}}


