//12. Write a Java program to sort each row of a 2D array in ascending order.
import java.util.Arrays;
import java.util.Scanner;

public class Sort2DArrayRows {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int[] row : array) {
            Arrays.sort(row);
        }

        System.out.println("Array after sorting each row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}