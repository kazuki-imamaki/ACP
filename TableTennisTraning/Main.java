package TableTennisTraning;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();

    long ans = 0;

    if (Math.abs(b - a) % 2 == 0) {
      ans = Math.abs(b - a) / 2;
    } else {
      long A1 = a - 1;
      long BN = n - b;
      long min = Math.min(A1, BN);
      ans = min + 1 + (b - a - 1) / 2;
    }

    System.out.println(ans);
    sc.close();
  }
}
