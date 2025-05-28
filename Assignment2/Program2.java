//2. WAP to find larger number among two numbers.

import java.util.Scanner;



public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int largerNumber = findLargerNumber(num1, num2);

        System.out.println("The larger number is: " + largerNumber);

        scanner.close();
    }
    public static int findLargerNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }
}