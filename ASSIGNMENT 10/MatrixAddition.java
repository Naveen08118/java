//5. Write a Java program to perform the addition of two 3x3 matrices.

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sumMatrix = new int[3][3];

        System.out.println("Enter elements for the first 3x3 matrix:");
        inputMatrix(scanner, matrix1);

        System.out.println("Enter elements for the second 3x3 matrix:");
        inputMatrix(scanner, matrix2);

        // Perform matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the two matrices:");
        printMatrix(sumMatrix);

        scanner.close();
    }

    // Method to take matrix input from the user
    static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}