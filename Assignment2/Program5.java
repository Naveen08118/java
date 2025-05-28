//5. WAP to take input of character and check it is vowel or consonant.


import java.io.*;

import java.util.Scanner;

public class Program5 {
    public static void main(String args[]) {
System.out.println("Please enter the character to check it is vowel or constant");

Scanner sc =new Scanner(System.in);
String input = sc.next();
        char ch = input.charAt(0);
        
        // check using if else
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u') {
            System.out.println(ch+" is a vowel");
        }else {
            System.out.println(ch+" is a consonant");
      }
    }
}