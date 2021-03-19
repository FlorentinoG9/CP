package Assignment_4;

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // declare de array to have 101 spaces so we can have the number 100 inside the
    // inputs
    // otherwise will be out of bounds
    int[] list = new int[101];
    int i = 0;

    // ask the user for inputs as lon it will be inside the parameters and ends with
    // a "0"
    // so we can get out of the loop
    System.out.print("Enter integers 1 - 100, with a space between and end inputs with a '0': ");
    do {
      // ask for inputs
      i = input.nextInt();
      if (i > 0) {
        // increment the array space by 1 everytime the input is count
        list[i]++;
      }
    } while (i > 0);

    // print the array only above 0's
    // it its only 1's or above with single time or plural if its greater than 1
    for (int j = 0; j < list.length; j++) {
      if (list[j] > 0 && list[j] == 1) {
        System.out.printf("%d occurs 1 time\n", j);
      } else if (list[j] > 1) {
        System.out.printf("%d occurs %d times\n", j, list[j]);
      }
    }

    input.close();
  }
}
