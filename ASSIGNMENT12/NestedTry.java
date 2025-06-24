
//5.5. Create a Java program to demonstrate nested try blocks. Use multiple levels of nested try-catch to handle //arithmetic and null pointer exceptions.


public class NestedTry {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block started");

            try {
                // Inner try block 1: ArithmeticException
                int result = 10 / 0; // This will throw ArithmeticException
                System.out.println("Result: " + result); // This line will not be reached
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner try block 1: " + e);
            }

            try {
                // Inner try block 2: NullPointerException
                String str = null;
                System.out.println("String length: " + str.length()); // This will throw NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException in inner try block 2: " + e);
            }

            System.out.println("Outer try block finished");

        } catch (Exception e) {
            // Catch block for any other exception in outer try
            System.out.println("Caught exception in outer try block: " + e);
        }
    }
}