
//3.Write a program to accept a string from the user and find out the following statistics:
//Count of uppercase character
//Count of lowercase character
//Count of digits
//Count of spaces


import java.util.Scanner;

public class StringSta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(currentChar)) {
                lowercaseCount++;
            } else if (Character.isDigit(currentChar)) {
                digitCount++;
            } else if (Character.isWhitespace(currentChar)) {
                spaceCount++;
            }
        }

        System.out.println("Uppercase characters: " + uppercaseCount);
        System.out.println("Lowercase characters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Spaces: " + spaceCount);

        scanner.close();
    }
}