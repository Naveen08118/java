//Assignment 5: Creating a Utility Package
package utils;
import java.util.Scanner;

public class Utilities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String manipulation
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Length: " + inputString.length());

        // Mathematical operations
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        int num1 = scanner.nextInt();
        System.out.print("Enter another integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Data validation
        System.out.print("Enter a positive number: ");
        while (!scanner.hasNextDouble() || scanner.nextDouble() <= 0) {
             System.out.println("Invalid input. Please enter a positive number.");
             scanner.next();
        }
        double positiveNumber = scanner.nextDouble();
        System.out.println("You entered a valid positive number: " + positiveNumber);

        scanner.close();
    }
}