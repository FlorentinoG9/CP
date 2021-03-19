package Practice_Exams;

import java.util.Scanner;
import java.util.Random;

public class MinMax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the Array: ");
    int size = input.nextInt();

    findMinMax(initializeArr(size));

    input.close();
  }

  public static int[] initializeArr(int size) {

    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Random().nextInt(100) + 1;
    }

    return arr;
  }

  public static void findMinMax(int[] arr) {

    for (int i = arr.length - 1; i > 0; i--) {
      boolean noSwaps = true;
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          var temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          noSwaps = false;
        }
      }
      if (noSwaps)
        break;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d ", arr[i]);
    }
    System.out.println();

    System.out.printf("The minimum in the arr is: %d\n", arr[0]);
    System.out.printf("The maximum in the arr is: %d", arr[arr.length - 1]);

  }
}
