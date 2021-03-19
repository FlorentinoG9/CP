package Practice_Exams;

public class Palindrome {
  public static void main(String[] args) {

    System.out.printf("Is aaa Palindrome ?: %s\n", isPalindromeString("aaa") ? "True" : "False");
    System.out.printf("Is abc Palindrome ?: %s\n", isPalindromeString("abc") ? "True" : "False");
    System.out.printf("Is cccc Palindrome ?: %s\n", isPalindromeString("cccc") ? "True" : "False");
    System.out.printf("Is asdf Palindrome ?: %s\n", isPalindromeString("asdf") ? "True" : "False");

  }

  public static boolean isPalindromeNum(int number) {

    int reverse = 0;
    int original = number;

    while (number != 0) {

      reverse = reverse * 10 + (number % 10);
      number /= 10;
    }

    return reverse == original;
  }

  public static boolean isPalindromeString(String text) {

    return text.equals(reverse(text));

  }

  public static String reverse(String input) {

    StringBuilder reverse = new StringBuilder();

    for (int i = input.length() - 1; i >= 0; i--) {
      reverse.append(input.charAt(i));
    }

    return reverse.toString();

  }
}
