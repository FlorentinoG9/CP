package Assignment_1;

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    // ask the user for input
    System.out.print("Enter a number between 0 - 1000: ");
    // store the input in number
    int n = input.nextInt();
    // declare vriable sum to 0
    int sum = 0;

    sum += n % 10;
    n /= 10;
    sum += n % 10;
    n /= 10;
    sum += n % 10;
    n /= 10;
    sum += n % 10;

    // check if the number is greater than 0 and between the range given
    // so we can skip this step if it does not
    if (n >= 0 && n <= 1000) {
      // break into if else statements so it won't run unnecessary code
      if (n >= 0 && n < 10) {
        sum = n;
      } else if (n > 9 && n < 100) {
        sum += n % 10;
        n /= 10;
        sum += n % 10;
      } else if (n > 99 && n < 1000) {
        sum += n % 10;
        n /= 10;
        sum += n % 10;
        n /= 10;
        sum += n % 10;
      } else {
        sum = 1;
      }
      // check if the number given is a negative number
    } else if (n < 0) {

      System.out.println("Sorry, Cant add a negative number");
    }

    // print the results to the cmd / terminal
    System.out.printf("the sum of all the digits is: %d", sum);

    input.close();
  }
}
