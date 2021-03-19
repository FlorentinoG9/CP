package Practice_Exams;

import java.util.Scanner;

public class Password {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("1. A password must have at least eight characters.");
    System.out.println("2. A password consists of only letters and digits.");
    System.out.println("3. A password must contain at least two digits");
    System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");

    String pass = input.next();

    System.out.printf("Password is %s: %s", isValidPassword(pass) ? "Valid" : "Invalid", pass);

    input.close();
  }

  public static boolean isValidPassword(String password) {

    int digitCount = 0;
    int charCount = 0;

    if (password.length() >= 8) {
      for (int i = 0; i < password.length(); i++) {
        if (isNumeric(password.charAt(i))) {
          digitCount++;
        } else if (isLetter(password.charAt(i))) {
          charCount++;
        } else {
          return false;
        }
      }
    }
    return digitCount >= 2 && charCount >= 6;
  }

  public static boolean isLetter(char ch) {

    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
  }

  public static boolean isNumeric(char ch) {

    return ch >= '0' && ch <= '9';
  }
}
