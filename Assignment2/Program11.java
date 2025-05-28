//11.WAP to check whether an input character is an alphabet, digit or special character.

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = sc.next().charAt(0);

        if (Character.isLetter(inputChar)) {
            System.out.println("The character is an alphabet.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special character.");
        }
        sc.close();
    }
}