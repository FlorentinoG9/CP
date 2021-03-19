package Practice_Exams;

import java.util.Random;

public class Segregation {
  public static void main(String[] args) {
    int [] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Random().nextInt(2);
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d ", arr[i]);
    }
    System.out.println();

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
  }
}
