package Assignment_4;

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] scores = new int[100];
    int total = 0;
    int scoreUp = 0;
    int scoreDown = 0;
    int value = 0;

    // ask for the scores
    System.out.print("Enter Scores: ");
    int j = 0;
    do {
      value = input.nextInt();

      // this will assign the value only if its greater than 0 or less than 100 scores
      if (value >= 0) {
        scores[j] = value;
        total += scores[j];
        j++;
      }

    } while (value >= 0 && j < 100);

    // declare and assign the average

    double avg = total / j;

    // go through the array, only the scores we submit not all the array
    // and incremeant the scores if its above the average or below the average
    for (int i = 0; i < j; i++) {
      if (scores[i] > avg) {
        scoreUp++;
      } else {
        scoreDown++;
      }
    }

    // print the average
    System.out.printf("Average: %.1f\n", avg);
    // and print the scores to see how many scores are above and below the average
    System.out.println("Numbers above average: " + scoreUp);
    System.out.println("Numbers below average: " + scoreDown);

    input.close();
  }
}
