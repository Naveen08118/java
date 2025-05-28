import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;

        System.out.println("Enter marks for five students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double averageMarks = (double) totalMarks / 5;
        double percentage = (double) totalMarks / (5 * 100) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}