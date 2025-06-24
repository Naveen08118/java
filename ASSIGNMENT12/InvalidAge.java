import java.util.Scanner;

// Custom Checked Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);  
    }
}



// Using the Custom Exception
public class InvalidAge {
    public static void validate(int age) 
      throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");//checks the eligibility of a person to vote
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {

System.out.println("enter the age to validate ");

Scanner sc=new Scanner(System.in);

int age2=sc.nextInt();
            validate(age2);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}