
//6.Create a String array that hold the name of 6 person. Perform    sorting on that array.


import java.util.Arrays;
import java.util.Scanner;

public class SortNamesArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[6];

        // Input names
        System.out.println("Enter the names of 6 people:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Sort the names using Arrays.sort()
        Arrays.sort(names);

        // Display the sorted names
        System.out.println("\nSorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}