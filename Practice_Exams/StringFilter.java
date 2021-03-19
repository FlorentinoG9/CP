package Practice_Exams;

public class StringFilter {
  public static void main(String[] args) {

    String message = "abrambabasc";
    char[] str = message.toCharArray();

    System.out.println(message);

    stringFilter(str);
  }

  public static void stringFilter(char[] str) {

    StringBuilder newStr = new StringBuilder();

    for (int i = 0; i < str.length; i++) {
      newStr.append(str[i]);
    }

    String str1 = newStr.toString();

    str1 = str1.replaceAll("ac", "");
    str1 = str1.replaceAll("b", "");

    System.out.printf("%s", str1);

  }
}
