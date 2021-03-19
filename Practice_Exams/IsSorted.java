package Practice_Exams;

import java.util.Scanner;

public class IsSorted {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter List: ");
    int[] list = new int[input.nextInt()];
    for (int i = 0; i < list.length; i++) {
      list[i] = input.nextInt();
    }

    System.out.printf("This list is %s", isSorted(list) ? "already Sorted" : "not sorted");

    input.close();
  }

  public static boolean isSorted(int[] list) {

    for (int i = 0; i < list.length - 1; i++) {
      if (list[i] > list[i+1]) {
        return false;
      }
    }

    return true;
  }

}
