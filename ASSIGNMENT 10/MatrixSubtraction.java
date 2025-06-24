
//6. Write a Java program to perform the subtraction of two 3x3 matrices.

import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        int[][] resultMatrix = new int[3][3];

        System.out.println("Enter elements of the first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of the second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Resultant matrix after subtraction:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}