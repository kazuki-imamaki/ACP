package DigitSum2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    sc.close();

    int ans = 0;
    String S = Long.valueOf(N).toString();
    if (N <= 9) {
      ans = (int) N;
    }
    for (int i = 1; i < S.length(); i++) {
      char s = S.charAt(i);
      if (s != '9') {
        ans = (int) S.charAt(0) - '0' + 9 * (S.length() - 1) - 1;
      } else {
        ans = (int) S.charAt(0) - '0' + 9 * (S.length() - 1);
      }
    }
    System.out.println(ans);
  }
}
