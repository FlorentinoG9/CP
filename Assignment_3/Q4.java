package Assignment_3;

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a, b, c;

    System.out.print("Give me a number for a: ");
    a = input.nextDouble();
    System.out.print("Give me a number for b: ");
    b = input.nextDouble();
    System.out.print("Give me a number for c: ");
    c = input.nextDouble();

    // call method sort
    sort(a, b, c);

    input.close();
  }

  public static void sort(double num1, double num2, double num3) {
    double temp;

    // iterate 3 times in the loop
    // so we can make sure that they sort in full
    for (int i = 0; i <= 2; i++) {
      if (num1 > num2) {
        // store the number in a temperal variable
        // before swaping the number, and we can assign the value to the second number
        temp = num1;
        // assign the value of the second number into the first number
        num1 = num2;
        // assign the value of the tempral variable into the second number
        num2 = temp;
      } else if (num2 > num3) {
        temp = num2;
        num2 = num3;
        num3 = temp;
      }
    }

    System.out.println("Sorted Numbers:");
    System.out.printf("a: %.2f | b: %.2f | c: %.2f", num1, num2, num3);

  }
}
