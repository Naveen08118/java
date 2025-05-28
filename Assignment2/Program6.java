//5. WAP to take input of character and check it is vowel or consonant.


import java.io.*;

import java.util.Scanner;

public class Program6 {
    public static void main(String args[]) {
System.out.println("Please enter the character to check it is vowel or constant");

Scanner sc =new Scanner(System.in);
String input = sc.next();
        char ch = input.charAt(0);
        
       switch(ch){
	case 'a':System.out.println(" a is vowel");break;
case 'e':System.out.println("e is  vowel");break;
case 'i':System.out.println("i is  vowel");break;
case 'o':System.out.println("o is vowel");break;
case 'u':System.out.println("u is  vowel");break;
default:System.out.println("entered char is consonant");
break;

    }
}}