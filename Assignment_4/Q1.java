package Assignment_4;

import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter integer: ");
    int num = input.nextInt();
    System.out.print("Enter number of digits: ");
    int wth = input.nextInt();

    System.out.println(format(num, wth));

    input.close();
  }

  public static String format(int number, int width) {
    // create an array for number
    String str = "";
    int original = number;
    int digits = 0;

    // know the number of digits inside the number
    do {
      number /= 10;
      digits++;
    } while (number > 0);

    // if the number of digits is less than width decrease the number of width
    // by the number of digits, if not, just print the number itself
    if (digits < width) {

      for (int i = 0; i < width - digits; i++) {
        // add leading zeros '0s', if digits is less than width
        str += 0;
      }
    }

    // add number after leading zeros if they are added in the last loop
    str += original;

    // return string to print
    return str;
  }
}
