package DividingAString;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringBuilder s = new StringBuilder();
    s.append(sc.nextLine());
    StringBuilder temp = new StringBuilder();
    ArrayList<String> devidedStrings = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      temp.append(s.substring(i, i + 1));

      if (i == 0 || !devidedStrings.get(devidedStrings.size() - 1).equals(temp.toString())) {
        devidedStrings.add(temp.toString());
        temp.delete(0, temp.length());
      } else {
        continue;
      }

    }
    System.out.println(devidedStrings.size());

  }
}
