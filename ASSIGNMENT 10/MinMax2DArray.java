//13. Write a Java program to find the maximum and minimum element in a 2D array.


import java.util.Scanner;

public class MinMax2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array2D = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array2D[i][j] = scanner.nextInt();
            }
        }

        int max = array2D[0][0];
        int min = array2D[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                }
                if (array2D[i][j] < min) {
                    min = array2D[i][j];
                }
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        scanner.close();
    }
}