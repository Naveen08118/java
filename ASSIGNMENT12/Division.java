import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;

        try {
            System.out.print("Enter the numerator: ");
            numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            denominator = scanner.nextInt();

            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }

    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) numerator / denominator;
    }
}