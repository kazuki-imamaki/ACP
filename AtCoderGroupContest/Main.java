package AtCoderGroupContest;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    ArrayList<Long> a = new ArrayList<>();
    for (int i = 0; i < 3 * n; i++) {
      a.add(sc.nextLong());
    }

    Collections.sort(a);

    long ans = 0;

    for (int i = 1; i < n + 1; i++) {
      ans += a.get(n * 3 - i * 2);
    }
    System.out.println(ans);

    sc.close();
  }
}
