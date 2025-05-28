//12.WAP to check whether a triangle can be formed by the given value for the angles.

import java.util.Scanner;
class Program12{

public static void main(String...k){

System.out.println("check whether triangle is formed with given value for angles");

System.out.println("enter first angle value of a traingle");
Scanner sc =new Scanner(System.in);
int angle1=sc.nextInt();
System.out.println("enter second angle value of a traingle");
int angle2=sc.nextInt();
System.out.println("enter third angle value of a traingle");
int angle3=sc.nextInt();
double sum=(angle1+angle2+angle3);
if(sum==180){
System.out.println("with the given values we CAN form Atriangle");
}
else{
System.out.println("with the given values we CANNOT form Atriangle");
}

}}
