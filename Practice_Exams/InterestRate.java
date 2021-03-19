package Practice_Exams;

import java.util.Scanner;

public class InterestRate {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("\033[4mEnter Loan Amount: ");
    double loan = input.nextDouble();
    System.out.print("Number of years: ");
    int years = input.nextInt();

    System.out.println("\nInterest Rate\t\tMonthly Payment\t\tTotal Payment");

    for (double i = 0.05; i <= 0.08; i = i + 0.00125) {
      System.out.printf("%1.3f%%\t\t\t$%,.2f\t\t\t$%,.2f\n", i * 100,
          ((loan * i / 12) * Math.pow(1 + i / 12, 12 * years)) / (Math.pow(1 + i / 12, 12 * years) - 1),
          ((loan * i / 12) * Math.pow(1 + i / 12, 12 * years)) / (Math.pow(1 + i / 12, 12 * years) - 1) * (years * 12));
    }

    System.out.println("\033[0m");
    input.close();
  }

}
