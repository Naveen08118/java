
//7. Write a Java program that processes command-line arguments. Ensure the program checks for valid number of //arguments and valid data types, and handle exceptions such as NumberFormatException and //ArrayIndexOutOfBoundsException.



public class ComLiPocessor {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please provide at least two arguments (an integer and a string).");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            String text = args[1];

            System.out.println("Number: " + number);
            System.out.println("Text: " + text);

            // Attempt to access an out-of-bounds argument
            try {
                String extra = args[2];
                System.out.println("Extra argument: " + extra);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Warning: ArrayIndexOutOfBoundsException caught - No extra argument provided.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: The first argument must be an integer.");
        }
    }
}