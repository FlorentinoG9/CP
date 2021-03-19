package Practice_Exams;

public class PrimeNumbers {
  public static void main(String[] args) {

    int n = 50;
    
    System.out.printf("The first %d prime numbers are: \n", n);

    printPrimeNumbers(n);
    
  }
  
  public static void printPrimeNumbers(int numberOfPrimes) {
    
    int num = 2;

    do {
      
      if (isPrime(num)) {
        System.out.printf("%3d ", num);
        numberOfPrimes--;
        if (numberOfPrimes % 10 == 0) {
          System.out.println();
        }
      } 

      num++;

    } while (numberOfPrimes > 0);
  }

  public static boolean isPrime(int number) {

    for (int i = (int) Math.sqrt(number); i >= 2; i--) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
