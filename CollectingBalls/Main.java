package CollectingBalls;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] xList = new int[n];
    for (int i = 0; i < n; i++) {
      xList[i] = sc.nextInt();
    }

    int ans = 0;

    for (int x : xList) {
      if (x <= k - x) {
        ans += x * 2;
      } else {
        ans += (k - x) * 2;
      }
    }

    System.out.println(ans);

    sc.close();
  }
}
