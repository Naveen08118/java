//7. Write a Java program to multiply two matrices. (Check matrix multiplication rule)

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible with these dimensions.");
            scanner.close();
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        System.out.println("Enter elements of the first matrix:");
        inputMatrix(scanner, matrixA, rowsA, colsA);

        System.out.println("Enter elements of the second matrix:");
        inputMatrix(scanner, matrixB, rowsB, colsB);

        multiplyMatrices(matrixA, matrixB, result);

        System.out.println("Resultant matrix:");
        printMatrix(result);

        scanner.close();
    }
     private static void inputMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void multiplyMatrices(int[][] matrixA, int[][] matrixB, int[][] result) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    }


    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}