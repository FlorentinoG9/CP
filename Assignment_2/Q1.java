package Assignment_2;

import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a month in number format: ");
    int month = input.nextInt();
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // the month variable is going to decide which case will be use to print the
    // month
    switch (month) {
    case 1:
      System.out.printf(" January, %d had 31 days", year);
      break;

    // case 2 is february which it can have 28 or 29 if is a leap year
    // so we check this first before printing
    case 2:
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            System.out.printf(" February, %d had 29 days", year);
          }
        } else {
          System.out.printf(" February, %d had 29 days", year);
        }
      } else {
        System.out.printf(" February, %d had 28 days", year);
      }
      break;

    case 3:
      System.out.printf(" March, %d had 31 days", year);
      break;

    case 4:
      System.out.printf(" April, %d had 30 days", year);
      break;

    case 5:
      System.out.printf(" May, %d had 31 days", year);
      break;

    case 6:
      System.out.printf(" June, %d had 30 days", year);
      break;

    case 7:
      System.out.printf(" July, %d had 31 days", year);
      break;

    case 8:
      System.out.printf(" Agust, %d had 31 days", year);
      break;

    case 9:
      System.out.printf(" September, %d had 30 days", year);
      break;

    case 10:
      System.out.printf(" October, %d had 31 days", year);
      break;

    case 11:
      System.out.printf(" November, %d had 30 days", year);
      break;

    case 12:
      System.out.printf(" December, %d had 31 days", year);
      break;

    default:
      System.out.println("Sorry, the input for month has to be in number format and between 1 - 12");
      break;
    }
    input.close();
  }
}
