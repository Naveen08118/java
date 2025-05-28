//6.WAP to check a given number is Armstrong or not.  

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}