//9.)WAP to print all prime number between 2 to 20

public class Program9 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 2 and 20 are:");
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}