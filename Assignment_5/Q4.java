package Assignment_5;

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // enter input for the number of students
    System.out.print("How many students do you have: ");
    String[][] students = new String[input.nextInt()][2];

    // enter the students name and grades for each student
    System.out.println("Enter the <name> <grade> in this order for each student: ");
    for (int i = 0; i < students.length; i++) {
      for (int j = 0; j < students[0].length; j++) {
        students[i][j] = input.next();
      }
    }

    // Sort the Array
    sortArray(students);

    // Print after Sorting
    System.out.println("Sorted Students by grades in descending order:");
    printArray(students);

    input.close();
  }

  // print the matrix or array of students
  // in the shape of a list
  public static void printArray(String[][] list) {
    System.out.println("");
    for (int i = 0; i < list.length; i++) {
      for (int j = 0; j < list[i].length; j++) {
        System.out.printf("%s ", list[i][j]);
      }
      System.out.println();
    }
  }

  // use bubble sort for to sort the students by grades
  public static String[][] sortArray(String[][] list) {
    for (int i = list.length - 1; i > 0; i--) {
      boolean noSwaps = true;
      for (int j = 0; j < i; j++) {
        // check for the value of the grade of the students
        if (Integer.valueOf(list[j][1]) < Integer.valueOf(list[j + 1][1])) {
          String tempName = list[j][0];
          String tempNum = list[j][1];

          // if we swap the grades we also swap the name of the student
          list[j][0] = list[j + 1][0];
          list[j][1] = list[j + 1][1];

          list[j + 1][0] = tempName;
          list[j + 1][1] = tempNum;

          // assign false to noSwaps so we can keep sorting the list
          noSwaps = false;

        }
      }
      if (noSwaps)
        break;
    }

    return list;
  }
}
