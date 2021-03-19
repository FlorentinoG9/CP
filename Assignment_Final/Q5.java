package Assignment_Final;

import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Scan the card: ");
    long cardNumber = input.nextLong();

    System.out.printf("%d is %s", cardNumber, isValid(cardNumber) ? "valid" : "invalid");

    input.close();
  }

  // return true if the card number is valid
  public static boolean isValid(long number) {

    /*
     * assign the getSize return number unto a variable, so we dont call it twice in
     * the if statement
     */
    int cardSize = getSize(number);
    // check if the size is correct between 13 and 16
    if (cardSize >= 13 && cardSize <= 16 &&
    // check for each prefix number that are available for card number
        prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) {
      // assign the sum of the algorith for both sum of even and odd numbers into a
      // sum variable
      int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
      // check if the sum is divisible by 10 evenly
      // if it is the card numbe is VALID if not is INVALID
      if (sum % 10 == 0)
        return true;
    }
    return false;
  }

  // *step 1
  public static int sumOfDoubleEvenPlace(long number) {
    int sum = 0;
    /*
     * The Long class wraps a value of the primitive type long in an object. An
     * object of type Long contains a single field whose type is long. In addition,
     * this class provides several methods for converting a long to a String and a
     * String to a long, as well as other constants and methods useful when dealing
     * with a long.
     * 
     * get the size digits from the card number assign it to "i" - 2 (Even numbers)
     * and the decreasing value by 2 so we skip 1 place each time until reaching the
     * final Even number
     */
    for (int i = getSize(number) - 2; i >= 0; i -= 2) {
      /*
       * Integet ParseInt converts the String into an Int representation Long .
       * toString() converts the value into string charAt() pass through a parameter
       * number indicating the index of (number value) of the String given and adding
       * double quotes to convert everything into a string so the Integer.parseInt can
       * convert it into a number again
       * 
       * then -> if the call the method getDigit, if the number is a 2 digit number we
       * return- the sum of the 2 digits,if not we just return the same number keep
       * reapeating until we have every value and adding every value into sum
       */
      sum += getDigit(Integer.parseInt(Long.toString(number).charAt(i) + "") * 2);
    }
    return sum;
  }

  // *step 2
  // return sum of odd-place digits in number
  public static int sumOfOddPlace(long number) {
    int sum = 0;
    /*
     * get the size digits from the card number assign it to "i" - 1 (Odd numbers)
     * and the decreasing value by 2 so we skip 1 place each time until reaching the
     * final odd number
     */
    for (int i = getSize(number) - 1; i >= 0; i -= 2) {
      /*
       * Integet ParseInt converts the String into an Int representation Long .
       * toString() converts the value into string charAt() pass through a parameter
       * number indicating the index of (number value) of the String given and adding
       * double quotes to convert everything into a string so the Integer.parseInt can
       * convert it into a number again keep reapeating until we have every value and
       * adding every value into sum
       */

      sum += Integer.parseInt(Long.toString(number).charAt(i) + "");
    }

    // return the sum value
    return sum;
  }

  /*
   * return this number if it is a single digit, otherwise, return the sum of the
   * two digits
   */
  public static int getDigit(int number) {
    /*
     * if the number is less than 10 return that number if is above or equal to 10
     * take the last digit and add it with the division of the number 14 -> (14 %
     * 10) = 4 and (14 / 10) = 1
     */
    return number < 10 ? number : number % 10 + number / 10;
  }

  // return the number of digits in d
  public static int getSize(long d) {
    /*
     * converts the long into String and add the length method this give us an int
     * to know how many numbers is in the number of the card given by the user
     */

    return Long.toString(d).length();
  }

  // return true if the digit d is a prefix for number
  public static boolean prefixMatched(long number, int d) {
    /*
     * pass the card number and the prefix number into the getPrefix method inside
     * this method call the getSize method to know how many digits are in the "d"
     * parameter since we can have a card with 1 or 2 digits as a prefix
     */
    return getPrefix(number, getSize(d)) == d;
  }

  /*
   * return the first "k" number of digits from number. if the number of digits in
   * number is less than k, return number
   */
  public static long getPrefix(long number, int k) {
    /*
     * Convert the number into a string get the first numbers from the "String" or
     * card number from the first character (0) to k (number of digits) either 1 or
     * 2. Long.parseLong returns a Long value: Parses the string argument as a
     * signed decimal long. The characters in the string must all be decimal digits
     */
    return Long.parseLong(Long.toString(number).substring(0, k));
  }
}
