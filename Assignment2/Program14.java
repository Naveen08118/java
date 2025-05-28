//14.WAP to print user menu and take input of two numbers and perform operation according to the user choice  
//Addition,Subtraction,Multiplication,Division(using operators)

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("a. Addition");
        System.out.println("b. Subtraction");
        System.out.println("c. Multiplication");
        System.out.println("d. Division");
        System.out.print("Enter choice(a/b/c/d): ");

        char choice = scanner.next().charAt(0);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (choice) {
            case 'a':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 'b':
                result = num1 - num2;
                System.out.println(num1 + " - "  + num2 + " = " + result);
                break;
            case 'c':
                result = num1 * num2;
                 System.out.println(num1 + " * "  + num2 + " = " + result);
                break;
            case 'd':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error! operator is not correct");
                return;
        }
        scanner.close();
    }
}

