//17.WAP to find maximum dbetween two numbers using switch statement.

import java.util.Scanner;
import java.io.*;
class Program17{

public static void main(String...k){
System.out.println("enter First number");
Scanner sc =new Scanner(System.in);
int number1=sc.nextInt();
System.out.println("enter Second number");
int number2=sc.nextInt();
int result=(((number1>number2)?1:0));
//System.out.println(result);


switch(result){


 case  1 :
                 System.out.println("First number is Greater");
                  break;
        default :

                      System.out.println("Second number is Greater");
                       break;
}

}

}