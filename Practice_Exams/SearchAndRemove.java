package Practice_Exams;

public class SearchAndRemove {
  public static void main(String[] args) {

    String message = "abrambabasac";

    removeSetofCharacters(message, "b", "ac");
  }

  public static void removeSetofCharacters(String str, String ptn1, String ptn2) {

    String newStr = str.replaceAll(ptn1, "");
    newStr = newStr.replaceAll(ptn2, "");

    System.out.printf("The String given is: %s \n", str);
    System.out.printf("After removing the new string is: %s", newStr);
  }
}
