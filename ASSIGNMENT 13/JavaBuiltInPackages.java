//Assignment 4: Importing Built-in Java Packages
//Write a Java program that uses built-in packages such as `java.util`, `java.io`, and `java.time`. Perform //operations like reading user input, working with lists, and printing current date and time.




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.Console;

public class JavaBuiltInPackages {

    public static void main(String[] args) {
        // 1. Reading user input using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // 2. Working with a list
        List<String> hobbies = new ArrayList<>();
        System.out.println("Enter your hobbies (type 'done' to finish):");
        while (true) {
            System.out.print("Hobby: ");
            String hobby = scanner.nextLine();
            if (hobby.equalsIgnoreCase("done")) {
                break;
            }
            hobbies.add(hobby);
        }

        // 3. Printing current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Using Console for password input (optional, can be used instead of Scanner)
        Console console = System.console();
        String password = "";
        if(console != null) {
            System.out.print("Enter your password: ");
            password = new String(console.readPassword());
        } else {
            System.out.println("Console not available, password input will be shown in plain text.");
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
        }


        // Printing all collected information
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobbies: " + hobbies);
        System.out.println("Current Date and Time: " + formattedDateTime);
        System.out.println("Password: " + password);

        scanner.close();
    }
}