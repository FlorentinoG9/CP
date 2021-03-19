package Assignment_Final;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double currency;
    double exchangeRate;
    int choose = 0;

    System.out.println("Currency Converter");

    // ask for the exchange rate from the currencies
    do {
      System.out.print("Enter the exchange rate from USD to CNY: ");
      exchangeRate = input.nextDouble();

      // print eror if the ExRt is negative
      if (exchangeRate < 0) {
        // those weird numbers are the ones making the background yellow and re font in
        // red
        // and the last part resets the bash font to normal, otherwise it will be with
        // background yellow and font color redall the way
        System.out
            .println("\n\033[43m\033[1;31m Incorrect input, please try to enter a positive exchange rate \033[0m\n");
      }

      // do this until the ExRt is a positive number
    } while (exchangeRate < 0);

    // ask the user from what curency he wants to convert to
    do {
      System.out.println("0: USD -> CNY");
      System.out.println("1: CNY -> USD");
      System.out.print("Exchange to: ");

      choose = input.nextInt();

      // print error if the option does not exists
      if (choose > 1 || choose < 0) {
        // those weird numbers are the ones making the background yellow and re font in
        // red
        // and the last part resets the bash font to normal, otherwise it will be with
        // background yellow and font color redall the way
        System.out.println("\n\033[43m\033[1;31m Incorrect input, please enter only 1 or 0 \033[0m\n");
      }

      // repeat until it chooses a valid option
    } while (choose > 1 || choose < 0);

    // ask for the amount that is goint to change
    do {
      // ask for the amount depending on what currency he choose from las step
      System.out.printf("Enter %s amount: ", choose == 0 ? "USD" : "CNY");
      currency = input.nextDouble();

      // if the currency is negative display error
      if (currency < 0) {
        // those weird numbers are the ones making the background yellow and re font in
        // red
        // and the last part resets the bash font to normal, otherwise it will be with
        // background yellow and font color redall the way
        System.out.println("\n\033[43m\033[1;31m Incorrect amount, please enter a positive number\033[0m\n");
      }
      // repeat until the currency is a positive number
    } while (currency < 0);

    // depending on what currency is going to exchange call the corresponding method
    if (choose == 0) {
      usdToRmb(currency, exchangeRate);
    } else {
      rmbToUsd(currency, exchangeRate);
    }

    input.close();
  }

  public static void usdToRmb(double usd, double exRt) {
    // print from USD to CNY chinese currency and do a calculation multiply it by
    // the exchange rate
    System.out.printf("\n%,.2f USD is %,.2f CNY", usd, usd * exRt);
  }

  public static void rmbToUsd(double cny, double exRt) {
    // print from CNY to USD dollars and do a calculation divid it by the exchange
    // rate
    System.out.printf("\n%,.2f CNY is %,.2f USD", cny, cny / exRt);
  }
}
