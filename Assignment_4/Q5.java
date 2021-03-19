package Assignment_4;

import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] list = new int[10];
    int num = 0;

    // ask for input 10 integers greater than 0
    System.out.println("Enter 10 Integers grater than 0: ");
    for (int i = 0; i < list.length; i++) {
      // store input inside num
      num = input.nextInt();
      // declare a boolean to see if the number exist in the array
      boolean inArray = false;
      for (int j = 0; j <= i; j++) {
        // check if the input exists in the array "use boolean"
        // assign the inArray Bool to true if the number exists inside the array
        if (list[j] == num) {
          inArray = true;
          // if true break the "j" loop (there is no point to keep checking the array)
          break;
        }
      }
      // if the number exists in the array do not assign the number in the array
      // if it does not exists, assign the number
      if (!inArray) {
        list[i] = num;
      }
    }

    // print the array only numbers greater than 0
    for (int i = 0; i < list.length; i++) {
      if (list[i] > 0) {
        System.out.printf("%d ", list[i]);
      }
    }

    input.close();
  }
}
