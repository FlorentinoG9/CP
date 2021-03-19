package Assignment_3;

public class Q5 {
  public static void main(String[] args) {

    // print the header of the table
    System.out.println("\nFeet\t\tMeters\t\t|\tMeters\t\tFeet");
    System.out.println("________________________________|______________________________");

    for (double i = 1; i <= 10; i++) {
      // print the numbers and call the methods as we print each time
      System.out.printf("%1.1f\t\t%1.3f\t\t|\t%2.1f\t\t%3.3f\n", i,
          // call methods so we can conver foot into meters by passing the arguments i
          footToMeters(i), 20 + (i - 1) * 5,
          // call methods so we can conver meters into foot by passing the arguments i and
          // having an Arithmetic Series
          metersToFoot(20 + (i - 1) * 5));

    }
  }

  public static double footToMeters(double foot) {
    // method convert feet into meters
    return 0.305 * foot;
  }

  public static double metersToFoot(double meter) {
    // method converts meters into feet
    return 3.27869 * meter;
  }
}
