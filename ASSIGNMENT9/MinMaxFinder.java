//Assignment 3: Maximum and Minimum Element
import java.util.Arrays;
import java.util.Scanner;
public class MinMaxFinder {

    public static int setmini(int[] A, int N)
    {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }

    public static int setmaxi(int[] A, int N)
    {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] > maxi) {
                maxi = A[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args)
    {
        //int[] A = { 4, 9, 6, 5, 2, 3 };
        
System.out.println("please enter the size of array");


Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

int[] A=new int[size];

int N = A.length;
System.out.println("please enter the elements of array");        
for(int i=0;i<N;i++){

A[i]=sc.nextInt();

}





System.out.println("Minimum element is: "
                           + setmini(A, N));
        System.out.println("Maximum element is: "
                           + setmaxi(A, N));
    }
}