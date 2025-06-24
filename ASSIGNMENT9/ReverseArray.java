
//Assignment 5: Reverse the Array
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        System.out.println("Array in reverse order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}