
//5.WAP to find y to the power of x .  

public class Program5 {
    public static void main(String[] args) {
        int y = 2; // Base number
        int x = 5; // Exponent
        long result = 1;

        for (int i = 0; i < x; i++) {
            result *= y;
        }

        System.out.println(y + " to the power of " + x + " is: " + result);
    }
}