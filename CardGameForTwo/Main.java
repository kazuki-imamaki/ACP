package CardGameForTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextInt());
    }
    Collections.sort(a, Collections.reverseOrder());

    int alice = 0;
    int bob = 0;
    for (int i = 0; i < a.size(); i++) {
      if (i % 2 == 0) {
        alice += a.get(i);
      } else {
        bob += a.get(i);
      }
    }
    System.out.println(alice - bob);

    sc.close();
  }
}
