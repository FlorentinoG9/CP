package Assignment_4;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // declare the array of 10 positions
    int[] range = new int[10];

    // ask for inputs to fill the array
    System.out.printf("Enter %d integers: ", range.length);
    for (int i = 0; i < range.length; i++) {
      range[i] = input.nextInt();
    }

    // this loop will swap the position with its opposite position
    // 1st <-> last number
    // 2nd <-> 2nd last number
    // ...
    // so on untill reaching the middle of the array
    for (int i = 0; i < Math.floor(range.length / 2); i++) {
      int temp = range[i];
      range[i] = range[range.length - 1 - i];
      range[range.length - 1 - i] = temp;
    }

    // print the array swaped, which is in the reverse way
    System.out.print("Reverse Array: ");
    for (int i = 0; i < range.length; i++) {
      System.out.printf("%d ", range[i]);
    }

    input.close();
  }
}
