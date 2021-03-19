package Assignment_2;

public class Q5 {
  public static void main(String[] args) {

    // assign a value for number so you wont reapeat your self
    // also is easier to change
    int num = 8;

    for (int i = 0; i < num; i++) {
      // print the spaces before the triangle
      for (int j = 0; j < num - i; j++) {
        System.out.print("    ");
      }
      // print the first part of the triangle increaseing numbers
      for (int j = 0; j <= i; j++) {
        System.out.printf("%3.0f ", Math.pow(2, j));
      }
      // print the seconnd part of the triangle decreasing numbers
      for (int j = i - 1; j >= 0; j--) {
        System.out.printf("%3.0f ", Math.pow(2, j));
      }
      System.out.print("\n");
    }

  }
}
