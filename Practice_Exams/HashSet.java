package Practice_Exams;

public class HashSet {
  public static void main(String[] args) {
    String[] array1 = { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };
    String[] array2 = { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };
    String[] set = new String[10];

    int setNum = 0;

    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i].equals(array2[j]) ) {
          set[setNum] = array1[i];
          setNum++;
        }
      }
    }

    System.out.print("Values in Array1 are: ");
    for (int i = 0; i < array1.length; i++) {
      System.out.printf("%s,6 ", array1[i]);
    }
    System.out.println();
    System.out.print("Values in Array2 are: ");
    for (int i = 0; i < array2.length; i++) {
      System.out.printf("%s, ", array2[i]);
    }
    System.out.println();
    System.out.print("Values in HashSet are: ");
    for (int i = 0; i < set.length; i++) {
      if (set[i] != null) {
        System.out.printf("%s ", set[i]);
      }
    }
  }
}
