//18.WAP to check whether a number is positive, negative or zero using switch statement.
import java.util.Scanner;
import java.io.*;

class Program18{

public static void main(String...k){

System.out.println("enter the number to check positive or negative or zero");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();



switch(Integer.signum(number))
{
case 1 : System.out.print("entered number is positive");break;
case -1 :System.out.print("entered number is negative");break;
default :System.out.print("entered number is zero");break;
                    


}

//System.out.println(number + " is " + message);
        sc.close();

}

}

