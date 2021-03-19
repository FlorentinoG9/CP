package Assignment_3;

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("What's your number: ");
    int num = input.nextInt();

    // pass the number to the method isPalindrome() check if it is and print result
    if (isPalindrome(num)) {
      System.out.printf("The number %d is a palindrome", num);
    } else {
      System.out.printf("The number %d is NOT a Palindrome", num);
    }
    // avoid warning and close the sanner
    input.close();
  }

  // method reverse
  public static int reverse(int number) {
    // declare a varibale reverse to 0
    int reverse = 0;

    // while number is different than 0
    while (number != 0) {
      // we subtract the last digit and add it to the reverse variable as the next
      // digit avilable
      reverse = reverse * 10 + (number % 10);
      // get rid of the last difit from number and repeat
      number /= 10;
    }
    // return the reverse number to compare to the original number
    return reverse;
  }

  public static boolean isPalindrome(int number) {

    // compare the original number with the reverse number
    // if they are equal return true

    return number == reverse(number);
  }
}
