
//13. WAP to check whether a triangle is Equilateral, Isosceles or Scalene.

import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3:");
        double side3 = scanner.nextDouble();

        if (isValidTriangle(side1, side2, side3)) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Invalid Triangle: The sum of any two sides must be greater than the third side.");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}