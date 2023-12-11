package IceTeaStore;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long Q = sc.nextLong();
    long H = sc.nextLong();
    long S = sc.nextLong();
    long D = sc.nextLong();
    long N = sc.nextLong();

    long[] l1 = { Q * 4, H * 2, S };
    long[] l2 = { Q * 8, H * 4, S * 2, D };
    Arrays.sort(l1);
    Arrays.sort(l2);
    long ans = 0;

    ans += (N / 2) * (l2[0]);
    if (N % 2 == 1)
      ans += l1[0];

    System.out.println(ans);
    sc.close();
  }
}
