import java.util.Scanner;

public class InsertElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        // Input: Element to insert and index
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        System.out.print("Enter the index position (0-based): ");
        int indexPosition = scanner.nextInt();

        // Validate index position
        if (indexPosition < 0 || indexPosition > n) {
            System.out.println("Invalid index position. Must be between 0 and " + n);
            scanner.close();
            return;
        }

        // Create a new array with increased size
        int[] newArray = new int[n + 1];

        // Copy elements before the insertion point
        for (int i = 0; i < indexPosition; i++) {
            newArray[i] = originalArray[i];
        }

        // Insert the new element at the specified position
        newArray[indexPosition] = elementToInsert;

        // Copy elements after the insertion point
        for (int i = indexPosition + 1; i < n + 1; i++) {
            newArray[i] = originalArray[i - 1];
        }

        // Display the new array
        System.out.println("New array with inserted element:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}