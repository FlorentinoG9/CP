package Assignment_Final;

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask the user how many seconds for input
    System.out.print("How many seconds: ");
    int sec = input.nextInt();

    // use the input as a variable for the for-loop
    for (int i = sec; i > 0; i--) {
      // print the output in plural or singular
      if (i != 1) {
        System.out.printf("%d seconds remaining\n", i);
      } else {
        System.out.printf("%d second remaining\n", i);
      }

      try {
        // do wait 1000 miliseconds = 1 second
        Thread.sleep(1000);
      } catch (Exception e) {
        // if there is an error print the error message
        System.out.println(e);
      }
    }
    // print stopped when the for-loop finish so we know it stops counting
    System.out.println("Stopped");

    input.close();
  }
}
