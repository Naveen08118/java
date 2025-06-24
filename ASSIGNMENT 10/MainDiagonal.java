//9. Write a Java program to print the elements of the main diagonal of a 2D array.
import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main diagonal elements:");
        for (int i = 0; i < rows && i < cols; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}