package Assignment_5;

import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double[][] matrix = new double[3][4];

    // ask for inputs for the 3 by 4 matrix
    System.out.println("Enter a 3 by 4 Matrix row by row:");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = input.nextDouble();
      }
    }

    printMatrix(matrix);

    // sum the elements for each column
    for (int i = 0; i < matrix[0].length; i++) {
      System.out.printf("\nSum of the elements of column %d is: %.1f", i, sumColumn(matrix, i));
    }

    input.close();
  }

  // sum the column method
  public static double sumColumn(double[][] m, int columnIndex) {
    // assign a sum variable scoped
    double sum = 0.0;

    // sum the value of each row and add it to the variable "sum"
    for (int i = 0; i < m.length; i++) {
      sum += m[i][columnIndex];
    }

    // return the value of "sum"
    return sum;
  }

  // print the matrix to have a better view of the matrix
  public static void printMatrix(double[][] matrix) {
    System.out.println("\n\n\t\tMatrix");
    for (int i = 0; i < matrix[0].length; i++) {
      System.out.printf("\t%2d", i);
    }
    System.out.print("\n------------------------------------\n");
    for (int i = 0; i < matrix.length; i++) {
      System.out.printf("%d |", i);
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.printf("\t%.1f", matrix[i][j]);
      }
      System.out.println();

    }

  }
}
