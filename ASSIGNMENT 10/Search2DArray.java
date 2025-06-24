
//11. Write a Java program to search an element in a 2D array.


import java.util.Scanner;

public class Search2DArray {
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
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        boolean found = false;
        int rowIndex = -1;
        int colIndex = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == key) {
                    found = true;
                    rowIndex = i;
                    colIndex = j;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Element " + key + " found at row: " + rowIndex + ", column: " + colIndex);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        scanner.close();
    }
}