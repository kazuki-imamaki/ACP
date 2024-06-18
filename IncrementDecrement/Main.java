package IncrementDecrement;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    String S = sc.next();
    long x = 0;
    long result = 0;
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == 'I') {
        x++;
      }
      if (S.charAt(i) == 'D') {
        x--;
      }
      if (x > result) {
        result = x;
      }
    }
    sc.close();
    System.out.println(result);
  }
}