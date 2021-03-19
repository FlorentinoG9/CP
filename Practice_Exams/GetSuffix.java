package Practice_Exams;


public class GetSuffix {
  public static void main(String[] args) {
    
    System.out.printf("The Suffix of %d of the last %d Digits is: %d\n", 12345, 2, getSuffix(12345, 2));
    
    System.out.printf("The Suffix of %d of the last %d Digits is: %d", 1234567, 3, getSuffix(1234567, 3));
  }

  public static int getSuffix(int value, int numberOfDigits){

    return value % (int) Math.pow(10, numberOfDigits);
  }
}
