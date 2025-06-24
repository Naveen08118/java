import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            
            double sqrt = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + sqrt);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            System.out.println("Execution completed.");
            scanner.close(); 
        }
    }
}