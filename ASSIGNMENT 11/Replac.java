 
//5.Write a program to enter a sentence which contains some occurrence of ‘cat’ and ‘dog’. Enter a cat and dog name //and replace each occurrence of cat and dog in the entered sentence.

import java.util.Scanner;
class Replac{
public  static void main(String...k){
System.out.println("enter the String need to replace");  
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
	

System.out.println("enter the String to replace CAT");  
//Scanner sc=new Scanner(System.in);
String str3=sc.nextLine();

String newStr = str.replace("cat",str3);
System.out.println(newStr); 

System.out.println("enter the String to replace DOG ");  
//Scanner sc=new Scanner(System.in);
String str4=sc.nextLine();

String newStr1=newStr.replace("dog",str4);  

System.out.println(newStr1); 
}}
