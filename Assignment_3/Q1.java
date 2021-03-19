package Assignment_3;

public class Q1 {
  public static void main(String[] args) {

    int j = 1;

    for (int i = 2001; i <= 2100; i++) {
      // check and call the method if it is a leap year

      if (isLeapYear(i)) {
        // if it is print that number i
        System.out.printf("%d ", i, j);
        // adding 1 to j
        j++;
      }

      // after 10 prints skip line
      if (j % 11 == 0) {
        // break line if there are 10 numbers in the row
        System.out.println();
        // reassign the value of J so we can count again the next 10 numbers in a row
        j = 1;
      }

    }
  }

  // public static (return type) (method Name)(){}
  public static boolean isLeapYear(int yearLeap) {
    // return false by default
    return yearLeap % 4 == 0 && yearLeap % 100 != 0 || yearLeap % 400 == 0;
  }
}
