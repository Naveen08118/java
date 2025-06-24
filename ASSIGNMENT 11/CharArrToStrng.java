//4.Write a Java program to create a new String object with the contents of a character array.


import java.util.Scanner;

public class CharArrToStrng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the character array: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        char[] charArray = new char[length];
        System.out.println("Enter the characters for the array:");
        for (int i = 0; i < length; i++) {
            charArray[i] = scanner.nextLine().charAt(0);
        }

        String str = new String(charArray);

        System.out.println("The created String is: " + str);
        scanner.close();
    }
}