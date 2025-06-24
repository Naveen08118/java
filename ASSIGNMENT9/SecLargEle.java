// Java program to find second largest element in an array

import java.util.Scanner;
import java.util.Arrays;

class SecLargEle {
    
    // function to find the second largest element
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
            
            // return the first element which is not equal to the 
            // largest element
            if (arr[i] != arr[n - 1]) {
                
System.out.println("SECOND LARGEST ELEMENT IN ARRAY IS="+arr[i]);
            
return arr[i];

}
        }
        
        // If no second largest element was found, return -1
        return -1;
    }

    public static void main(String[] args) {
  //      int[] arr = { 12, 35, 1, 10, 34, 1 };
        

System.out.println("enter size of array1");
Scanner sc=new Scanner(System.in);
int size1=sc.nextInt();

int[] arr=new int[size1]; 

System.out.println("enter elements in array1");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();

}





System.out.println(getSecondLargest(arr));
    }
}