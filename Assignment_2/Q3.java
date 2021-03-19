package Assignment_2;

public class Q3 {
  public static void main(String[] args) {

    // print the first line out of the loop
    System.out.println("Kilograms(Kg)\tPounds(lb)");

    // print the loop using the inside variable
    // kg -> lb
    // 1 -> 2.2
    for (int i = 1; i < 200; i++) {
      System.out.printf("%d\t\t%.1f\n", i, i * 2.2);
    }
  }
}
