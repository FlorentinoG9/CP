package Assignment_2;

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask the user for input
    System.out.print("Choose a number between 1 - 15: ");
    // assign the given input to the variable num
    int num = input.nextInt();

    // use num in each for statement needed
    for (int i = 0; i < num; i++) {
      // print the spaces before
      for (int j = 1; j < num - i; j++) {
        System.out.print("   ");
      }
      // print the first part of the triangle increasing the numbers
      for (int j = i; j >= 0; j--) {
        System.out.printf("%2d ", j + 1);
      }
      // print the second part of the triangle decreasing the numbers
      for (int j = 0; j < i; j++) {
        System.out.printf("%2d ", j + 2);
      }
      // break line
      System.out.print("\n");
    }
    input.close();
  }
}
