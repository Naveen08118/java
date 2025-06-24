//Assignment 2: Array Sum and Average


import java.util.Scanner;
class ArraySumAvg{
public static void main(String[] k){
//size =0;
System.out.println("please enter the array size");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

int[] art=new int[size];

int sum=0;
//sc.nextLine();
System.out.println("please enter the array elements ");

for (int i=0;i<art.length;i++) 
{

Scanner sct=new Scanner(System.in);
art[i]=sct.nextInt();

sum=sum+art[i];
}
System.out.println("sum of all elements is="+ sum);


        double average = (double) sum / art.length;
System.out.println("average of all elements is="+ average);

}


}
