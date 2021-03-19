package Assignment_5;

import java.util.Random;

public class Q3 {
  public static void main(String[] args) {
    int[] list = new int[100000];
    int key = new Random().nextInt(100000) + 1;

    for (int i = 0; i < list.length; i++) {
      list[i] = new Random().nextInt(100000) + 1;
    }

    // !!System.currentTimeMillis() Does not show enough milliseconds,
    // !!Use nanoTime() instead and divide it by 1,000,000
    // * Linear Search
    System.out.println("\nLinear Search___________________");
    // store time in a long variable
    long start = System.nanoTime() / 1000000;
    // call the method for linear Search and store it in a variable
    int linear = linearSearch(list, key);
    // use the linear variable so we dont call the method again while printing the
    // result
    System.out.println(linear > -1 ? "Number found is: " + linear : "Key Not Found");
    // store again the time in a ling avriable
    long end = System.nanoTime() / 1000000;
    // print the start time less the end time
    // so we can have how much time was to call the method
    System.out.printf("Time for linear Search: %d milliseconds \n", end - start);

    // * Bubble Sort before binary search (~ 33 seconds)
    start = System.nanoTime() / 1000000;
    int[] listSorted = bubbleSort(list);
    end = System.nanoTime() / 1000000;
    System.out.printf("Time for Sort: %d milliseconds \n", end - start);

    // * Binary Search
    System.out.println("\nBinary Search___________________");
    start = System.nanoTime() / 1000000;
    int binary = binarySearch(listSorted, key);
    System.out.println(binary > -1 ? "Number found is: " + binary : "Key Not Found");
    end = System.nanoTime() / 1000000;
    System.out.printf("Time for Binary Search: %d milliseconds", end - start);
  }

  public static int linearSearch(int[] list, int key) {

    // loop through the array until we foun the key or end the loop
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        // returns the key if found
        return list[i];
    }
    // return -1 if not found
    return -1;
  }

  public static int binarySearch(int[] list, int key) {
    // declare all variables
    // declare start where to start searching
    int start = 0;
    // declare end where to end in the array
    int end = list.length - 1;
    // and mid which is the middle of the array
    int mid = (int) Math.floor((start + end) / 2);

    // while the key is not found or we finish looking into the array
    // we keep in the while loop
    while (list[mid] != key && start <= end) {

      // if the key is less than mid number in the array
      // we narrow the search in half
      // either way is it less than mid or greater than mid
      // this way we can look for the key number either up or down
      // and narrow the search each iteration of the loop
      if (key < list[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      mid = (int) Math.floor((start + end) / 2);
    }

    // returns the key number if found
    // or -1 if is not in the array
    return list[mid] == key ? list[mid] : -1;
  }

  public static int[] bubbleSort(int[] arr) {

    System.out.println("\nSorting...");

    // check the array backwards, this way we wont be out of bounds of the array
    // on the second loop by adding + 1 and check the second number
    for (int i = arr.length - 1; i > 0; i--) {
      // boolean so we can check if it was a swap last in the loop,
      // this way if there are no swaps in the las iteration we can break the loop
      // and finish it erlier.
      boolean noSwaps = true;
      for (int j = 0; j < i; j++) {
        // make a swap if the condition is true
        if (arr[j] > arr[j + 1]) {
          // store in a temp variable the number we want to swap
          // so we wont lose the number
          var temp = arr[j];
          // swap the number: this will make the 2 numbers equal
          arr[j] = arr[j + 1];
          // and after changing the number we make the 2nd number
          // into the temp variable which was the first number
          arr[j + 1] = temp;
          // change the noSwaps to false if there are swaps
          // so we can keep looking to sort the array
          noSwaps = false;
        }
      }
      // if no swaps were made the array is already sorted
      // so we can break the loop and finish it before going through all the
      // iterations
      // this way we can save some time.
      if (noSwaps)
        break;
    }

    // print that we finish sorting the array and
    // retunr the array sorted
    System.out.println("Sorting Finished.");
    return arr;

  }
}
