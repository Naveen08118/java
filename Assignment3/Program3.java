//3.WAP to check a given number is palindrome or not. ( If reverse of a number and number is same, then it is //called palindrome).
  

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number using a for loop
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        // Check if the original and reversed numbers are equal
        return originalNumber == reversedNumber;
    }
}