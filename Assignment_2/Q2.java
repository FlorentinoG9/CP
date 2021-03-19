package Assignment_2;

import java.util.Scanner;
import java.util.Random;

public class Q2 {
  public static void main(String[] args) {
    // rock -> paper -> scissors
    Scanner input = new Scanner(System.in);
    // Ask the user to choose between 0 and 2
    System.out.println(" 0 - Scissors");
    System.out.println(" 1 - Rock");
    System.out.println(" 2 - Paper");
    System.out.print("Choose your weapon: ");
    int user = input.nextInt();
    // assign a value for the computer randomly
    int bot = new Random().nextInt(3);

    // check input for tha computer
    // then check the outcome for each case depending of the user input and computer
    switch (bot) {

    // if the computer is assign a value of Scissors this will be the outcome
    case 0:
      if (user == 0) {
        System.out.println("\nBoth have Scissors");
        System.out.println("Draw");
      } else if (user == 1) {
        System.out.println("\nComputer: Scissors");
        System.out.println("You: Rock");
        System.out.println("You, Won! :D");
      } else {
        System.out.println("\nComputer: Scissors");
        System.out.println("You: Paper");
        System.out.println("You, Lose! :C");
      }
      break;

    // if the computer is assign a value of Rock this will be the outcome
    case 1:
      if (user == 1) {
        System.out.println("\nBoth have Rock");
        System.out.println("Draw");
      } else if (user == 2) {
        System.out.println("\nComputer: Rock");
        System.out.println("You: Paper");
        System.out.println("You, Won! :D");
      } else {
        System.out.println("\nComputer: Rock");
        System.out.println("You: Scissors");
        System.out.println("You, Lose! :C");
      }
      break;

    // if the computer is assign a value of Paper this will be the outcome
    case 2:
      if (user == 2) {
        System.out.println("\nBoth have Paper");
        System.out.println("Draw");
      } else if (user == 0) {
        System.out.println("\nComputer: Paper");
        System.out.println("You: Scissors");
        System.out.println("You, Won! :D");
      } else {
        System.out.println("\nComputer: Paper");
        System.out.println("You: Rock");
        System.out.println("You, Lose! :C");
      }
      break;

    default:
      break;
    }

    input.close();

  }
}
