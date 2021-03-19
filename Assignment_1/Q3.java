package Assignment_1;

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    // init the scanner input for the user
    Scanner input = new Scanner(System.in);

    // ask the user fot the input
    System.out.print("what is the current weather in celcius: ");
    // store the input in the variable
    double celcius = input.nextDouble();

    double fahrenheit = (9.0 / 5) * celcius + 32;
    // print celsius to F
    System.out.printf(" %.1f°C = %.1f°F", celcius, fahrenheit);

    input.close();
  }
}
