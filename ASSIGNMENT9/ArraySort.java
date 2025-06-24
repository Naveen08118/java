//Assignment 8: Array Sorting (Ascending Order)

import java.util.Scanner;




public class ArraySort {

    public static void main(String[] args) {
        int[] arr;
        


System.out.println("enter size of array");

Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
arr=new int[size];


System.out.println("please enter elements in of array");

//Scanner sc=new Scanner(System.in);

for(int i=0;i<arr.length;i++){

arr[i]=sc.nextInt();

}



bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}