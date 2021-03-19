package Assignment_5;

import java.util.Scanner;
import java.util.Random;

public class Q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] exNum = new int[5];

    // * Ask for inputs for the Exluding Numbers Array
    System.out.print("Enter 5 numbers between 1 - 54: ");
    for (int i = 0; i < exNum.length; i++) {
      exNum[i] = input.nextInt();
    }

    // * Print the number not inlcuded in the Excluding Array
    System.out.printf("Number not included in the array are: %d", getRandom(exNum));

    input.close();
  }

  public static int getRandom(int... num) {

    // * declare random number
    int rand = new Random().nextInt(54) + 1;

    // ? Is random number in the array
    for (int i = 0; i < num.length; i++) {
      // ? If so reapeat
      if (rand == num[i]) {
        // * get another random number for rand and check again
        rand = new Random().nextInt(54) + 1;
        // * assign i = 0 again so we can check again the array from the beginning
        i = 0;
      }
    }

    // ? if not return Random number
    return rand;
  }
}
