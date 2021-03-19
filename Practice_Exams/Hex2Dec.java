package Practice_Exams;

import java.util.Scanner;

public class Hex2Dec {
  public static void main(String[] args) {
    // A = 10, B = 11, C = 12, D = 13, E = 14, F = 15.
    Scanner input = new Scanner(System.in);
    /*
     * ABCD => A*16^3 + B*16^2 + C*16^1+ D*16^0 = ((A*16 + B)*16 + C)*16+D = ((10*16
     * + 11)*16 + 12)*16+13 = 43981
     */

    System.out.printf("Enter a hex number: ");
    String hex = input.next().toUpperCase();

    System.out.printf("The decimal value for hex number %s is: %d", hex, hexToDecimal(hex));

     input.close();
  }

  public static int hexToDecimal(String hex) {

    int res = 0;

    for (int i = hex.length() - 1; i >= 0; i--) {
      res += hexCharToDecimal(hex.charAt(hex.length() - i - 1)) * Math.pow(16, i);
    }

    return res;

  }

  public static int hexCharToDecimal(char ch) {
    int num = 0;

    switch (ch) {
      case 'A':
        num = 10;
        break;
      case 'B':
        num = 11;
        break;
      case 'C':
        num = 12;
        break;
      case 'D':
        num = 13;
        break;
      case 'E':
        num = 14;
        break;
      case 'F':
        num = 15;
        break;
    
      default:
      if (ch >= '0' && ch <= '9') {
        num = Integer.parseInt(String.valueOf(ch));
      } else {
        System.out.println("Input Error");
      }
        break;
    }
    return num;
  }
}
