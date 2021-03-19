package Practice_Exams;

import java.util.Scanner;

public class AreaTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input Side-1: ");
    double side1 = input.nextDouble();
    System.out.print("Input Side-2: ");
    double side2 = input.nextDouble();
    System.out.print("Input Side-3: ");
    double side3 = input.nextDouble();

    double area = areaTriangle(side1, side2, side3);

    if (area > 0) {
      System.out.printf("The area of the triangle is: %f", area);
    } else {
      System.out.println("Is NOT a Valid Triangle");
    }

    input.close();
  }

  public static boolean isValid(double side1, double side2, double side3) {

    return (side1 + side2) >= side3 && (side2 + side3) >= side1 && (side1 + side3) >= side2;

  }

  public static double areaTriangle(double side1, double side2, double side3) {

    double area = 0.0;

    if (isValid(side1, side2, side3)) {
      double s = 0.5 * (side1 + side2 + side3);
      area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    return area;
  }
}
