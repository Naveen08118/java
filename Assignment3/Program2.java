//2.WAP to find the sum of all the digits of a given number. 

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        // Handle negative numbers by making them positive
        if (number < 0) {
            number = -number;
        }

        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}