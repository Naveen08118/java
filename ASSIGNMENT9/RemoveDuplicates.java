
//Assignment 12: Remove Duplicate Elements


import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(uniqueArray));

        scanner.close();
    }

    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        
        int n = array.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++){
            boolean isDuplicate = false;
            for(int k = 0; k < j; k++){
                if(array[i] == temp[k]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[j++] = array[i];
            }
        }
        
        int[] result = new int[j];
        for (int i = 0; i < j; i++){
            result[i] = temp[i];
        }
        return result;
    }
}