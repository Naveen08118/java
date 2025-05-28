//4. WAP to find the largest number among three numbers using conditional operator. 



public class Program4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        int largest = (num1 >= num2) ? (num1 >= num3 ? num1 : num3) : (num2 >= num3 ? num2 : num3);

        System.out.println("The largest number is: " + largest);
    }
}