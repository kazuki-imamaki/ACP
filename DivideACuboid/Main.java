package DivideACuboid;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();

    long[] l = { A, B, C };

    long ans = 0;
    Arrays.sort(l);
    if (l[2] % 2 != 0) {
      ans = (l[0] * l[1] * (l[2] / 2 + 1)) - (l[0] * l[1] * (l[2] / 2));
    }
    System.out.println(ans);
    sc.close();
  }
}
