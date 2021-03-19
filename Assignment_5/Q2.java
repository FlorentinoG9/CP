package Assignment_5;

import java.util.Random;

public class Q2 {
  public static void main(String[] args) {
    int[] arr = new int[100];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Random().nextInt(20) + 1;
    }
    // print unsorted Array
    showArray(arr);

    // Sort Array
    arr = bubbleSort(arr);

    // print Sorted Array
    showArray(arr);

    // call the method in order to eliminate duplicated numbers
    arr = eliminateDuplicates(arr);

    // print Single Numbers Array
    showArray(arr);

  }

  public static int[] eliminateDuplicates(int[] list) {
    // go through every space of the array
    for (int j = 0; j < list.length - 1; j++) {
      // if number inside the space of the array is equal to the next consecutive
      // space
      // assign the current space to "0"
      if (list[j] == list[j + 1]) {
        list[j] = 0;
      }
    }
    return list;
  }

  public static int[] bubbleSort(int[] arr) {

    // System.out.println("\n\nSorting...");

    // check the array backwards, this way we wont be out of bounds of the array
    // on the second loop by adding + 1 and check the second number
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
    return arr;
  }

  // this method is just for printing the array
  // so we dont have a repetitive code in main method
  // we are printing the numbers just if these numbers are NOT "0"
  public static void showArray(int[] arr) {
    System.out.println("\n");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        System.out.printf("%d ", arr[i]);
      }
    }
  }
}
