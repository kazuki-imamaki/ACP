package PostalCode;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    String S = sc.next();
    boolean result = true;

    if (S.length() == A + B + 1) {
      for (int i = 0; i < S.length(); i++) {
        if (i != A && !Character.isDigit(S.charAt(i))) {
          result = false;
        }
        if (i == A && S.charAt(i) != '-') {
          result = false;
        } else {
          continue;
        }
      }
    } else {
      result = false;
    }

    if (result) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }
}
