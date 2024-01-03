package CollatzProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<>();
    int result = 0;
    Outer: for (int i = 0;; i++) {
      if (i == 0) {
        a.add(s);
        continue;
      }
      if (a.get(a.size() - 1) % 2 == 0) {
        a.add(a.get(a.size() - 1) / 2);
      } else {
        a.add((3 * a.get(a.size() - 1)) + 1);
      }
      for (int j = 0; j < a.size() - 1; j++) {
        if (a.get(a.size() - 1) == a.get(j)) {
          result = i + 1;
          break Outer;
        }
      }
    }
    System.out.println(result);
    sc.close();
  }
}
