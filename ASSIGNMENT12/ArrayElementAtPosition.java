
//4.4. Write a Java program that takes an array of integers and a position as input from the user and displays the //element at that position. Handle ArrayIndexOutOfBoundsException.


import java.util.Scanner;

public class ArrayElementAtPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Get the position from the user
        System.out.print("Enter the position of the element to display: ");
        int position = scanner.nextInt();

        // Display the element at the specified position
        try {
            int element = array[position];
            System.out.println("Element at position " + position + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid position. The position must be between 0 and " + (size - 1) + ".");
        }

        scanner.close();
    }
}