//reverse of a number

//5.Define a class named Test with an instance variable num.
//Define a Constructor and a method named getReverse().
//Create an object of the class pass an integer to the constructor to initialize num. Call getReverse() to get the //reverse and print the reverse no.


import java.util.Scanner;
class Test{
    public int reversedNumber;
//default constructor

Test(){
      reversedNumber=0;

     }
public void getReverse(){


System.out.println("please enter the number to reverse");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
while (number != 0) {
        int lastDigit = number % 10;
        reversedNumber = reversedNumber * 10 + lastDigit;
        number = number / 10;
    }
System.out.println("entered number to reverse");

    System.out.println("the reversed number is="+ reversedNumber);
}

}



public class Program5{


public static void main(String...k)
{

Test num=new Test();
num.getReverse();




}


}