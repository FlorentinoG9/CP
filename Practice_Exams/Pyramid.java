package Practice_Exams;

import java.util.Scanner;

public class Pyramid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("Please enter a number: ");
    int num1 = input.nextInt();

    System.out.printf("please enter a number greater than %d: ", num1);
    int num2 = input.nextInt();

    for (int i = num1; i < num2; i++) {
      for (int j = 1; j < num2 - i; j++) {
        System.out.print("  ");
      }
      for (int j = num1; j <= i; j++) {
        System.out.printf(" %2d ", j);
      }
      System.out.print("\n");
    }

    input.close();
  }
}
