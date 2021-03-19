package Assignment_Final;

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask the user for the year
    System.out.print("\nEnter Year (YYYY): ");
    int year = input.nextInt();

    // ask the user for the month in number format
    System.out.print("Enter Month 1-12: ");
    int m = input.nextInt();

    // ask the user for the day of the month
    System.out.print("Enter day of the month 1-31: ");
    int q = input.nextInt();

    // if the month is 1 or 2 (jan or feb)
    // we need to add 12 to those numbers
    // and decrease the year by 1 because 13 or 14 will jump to the next year
    if (m < 3) {
      m += 12;
      year -= 1;
    }

    // after we know exactlly which year is it, then we do the calculations of j and
    // k
    int j = year / 100;
    int k = year % 100;

    // and applied them to the formula of int we do not want decimal numbers
    int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;

    // call the method so we can know which day of the week was that day
    dayOfWeek(h);

    input.close();
  }

  public static void dayOfWeek(int h) {
    // declare and String array of the name of days
    String[] day = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

    // print which day of the week is from the array
    System.out.printf("\nDay of the week is %s\n\n", day[h]);

  }
}
