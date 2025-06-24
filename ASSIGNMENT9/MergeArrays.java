
//Assignment 9: Merge Two Arrays
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {

System.out.println("enter size of array1");
Scanner sc=new Scanner(System.in);
int size1=sc.nextInt();

int[] arr1=new int[size1]; 

System.out.println("enter elements in array1");
for(int i=0;i<arr1.length;i++){
arr1[i]=sc.nextInt();


}


System.out.println("enter size of array2");
//Scanner sc=new Scanner(System.in);
int size2=sc.nextInt();
int[] arr2=new int[size2];
System.out.println("enter elements in array2");
for(int i=0;i<arr1.length;i++){
sc=new Scanner(System.in);
arr2[i]=sc.nextInt();


}







        int[] mergedArray = mergeArrays(arr1, arr2);

        // Print the merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];

        // Copy elements from arr1
        for (int i = 0; i < len1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < len2; i++) {
            mergedArray[len1 + i] = arr2[i];
        }

        return mergedArray;
    }
}