//Assignment 1: Array Basics – Input and Display

import java.util.Scanner;
class ArrayBasics{
public static void main(String...k){
System.out.println("please enter the array size");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

int[] art=new int[size];
System.out.println("please enter the array elements ");
for (int i=0;i<art.length;i++) 
{

Scanner sct=new Scanner(System.in);
art[i]=sct.nextInt();

}for(int i=0;i<art.length;i++){


System.out.println(art[i]);
}
}
}

