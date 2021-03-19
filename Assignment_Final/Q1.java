package Assignment_Final;

public class Q1 {
  public static void main(String[] args) {
    long population = 312_032_486;

    // seconds in a year 31,536,000
    // 1 year = 31,536,000 seconds = 365 days
    for (int i = 0; i < 5; i++) {
      int births = 31_536_000 / 7;
      int deaths = 31_536_000 / 13;
      int immigrants = 31_536_000 / 45;

      population = population + births - deaths + immigrants;

      System.out.printf("Year %d, population: %,d\n", i + 1, population);
    }
  }
}
