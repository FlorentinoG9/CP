package Assignment_3;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask for the year input
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    // ask for the day to start the month
    System.out.print("Enter a first day of the year: ");
    int day = input.nextInt();
    // if the users pick a highr number or equal to 7 day will be reduce to reminder
    // of 7
    day = day >= 7 ? day % 7 : day;

    int space = day + 1;

    // skip a line
    System.out.println("\n");
    for (int i = 1; i <= 12; i++) {
      // Print the Month and year title for each month
      System.out.printf("\t%s %d\n", month(i), year);
      System.out.println("____________________________");
      System.out.println("Sun Mon Tue Wen Thu Fri Sat");
      // Print the days to leave blank chosen by the user
      for (int j = 0; j < day; j++) {
        System.out.print("    ");
      }
      // store the days for each month calling method monthDays
      // and passing the year given by the user
      // and the number of the month
      int daysMonth = monthDays(year, i);
      // print the body of each month
      for (int j = 1; j <= daysMonth; j++) {
        System.out.printf(" %2d ", j);
        space++;
        // it brakes the line to keep inside the month box
        if (space % 8 == 0) {
          System.out.println();
          space = 1;
        }
        // assign the value to keep the spacing on the next day the next month
        // and not start from the Sunday each time
        day = space - 1;
      }
      System.out.println("\n");
    }
    // close input to avoid warning
    input.close();
  }

  // Print month Title
  public static String month(int month) {
    String monthName = "";
    switch (month) {
    case 1:
      monthName = "January";
      break;

    case 2:
      monthName = "February";
      break;

    case 3:
      monthName = "March";
      break;

    case 4:
      monthName = "April";
      break;

    case 5:
      monthName = "May";
      break;

    case 6:
      monthName = "June";
      break;

    case 7:
      monthName = "July";
      break;

    case 8:
      monthName = "August";
      break;

    case 9:
      monthName = "September";
      break;

    case 10:
      monthName = "October";
      break;

    case 11:
      monthName = "November";
      break;

    case 12:
      monthName = "Dicember";
      break;

    default:
      break;
    }

    return monthName;
  }

  // Know if its a leap year or not
  public static boolean isLeapYear(int year) {

    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  // How many days have each month
  public static int monthDays(int year, int month) {

    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      return 31;
    } else if (month == 2) {
      if (isLeapYear(year)) {
        return 29;
      } else {
        return 28;
      }
    }

    return 30;
  }
}
