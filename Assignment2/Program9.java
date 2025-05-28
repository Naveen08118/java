



//9.WAP to check whether an input number is single digit, two digit or three digit.

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check whether an input number is single digit, two digit or three digit.: ");
        int number = scanner.nextInt();
        
        if (number >= 0 && number <= 9) {
            System.out.println("The number is a single-digit number.");
        } else if (number >= 10 && number <= 99) {
            System.out.println("The number is a two-digit number.");
        } else if (number >= 100 && number <= 999) {
            System.out.println("The number is a three-digit number.");
        } else {
            System.out.println("The number has more than three digits.");
        }
        
        scanner.close();
    }
}