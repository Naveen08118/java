//14. Write a Java program to implement a jagged array and display its elements.
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the jagged array: ");
        int rows = scanner.nextInt();

        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];

            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The jagged array is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}