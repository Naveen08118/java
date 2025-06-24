//2. Write a Java program to find the sum of all elements in a 2D array.


public class SumArray {
    public static void main(String[] args) {
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = calculateSum(array2D);
        System.out.println("Sum of all elements: " + sum);
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}