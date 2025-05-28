//10.WAP to input the age of a candidate and determine whether it is eligible for casting his/her own vote or not.
import java.util.Scanner;
public class Program10
{
public static void main(String...k)
{
System.out.println("enter the age of candidate");
Scanner sc= new Scanner(System.in);
int age=sc.nextInt();
if(age>=18){
System.out.println("the citizen is able to cast the vote");
}else
{
System.out.println("the citizen is unable to cast the vote");
}
}
}