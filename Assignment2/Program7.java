//7. WAP to take input of 5 subject marks and display the grade according to table :


import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        double averageMarks = calculateAverage(marks);
        String grade = assignGrade(averageMarks);

        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public static String assignGrade(double averageMarks) {
        String grade;
         if (averageMarks >= 90) {
            grade = "A+";
        } else if (averageMarks >= 80 && averageMarks< 90 ) {
            grade = "A";
        } else if (averageMarks >= 70 && averageMarks< 80) {
            grade = "B+";
        } else if (averageMarks >= 60 && averageMarks< 70) {
            grade = "B";
        } else if (averageMarks >= 50 && averageMarks< 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        return grade;
    }
}