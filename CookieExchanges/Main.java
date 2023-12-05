package CookieExchanges;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    sc.close();
    int answer = 0;
    if (A % 2 == 1 || B % 2 == 1 || C % 2 == 1)
      ;
    else if (A == B && B == C) {
      answer = -1;
    } else {
      for (int i = 1;; i++) {
        int tempA = A;
        int tempB = B;
        int tempC = C;
        A = tempB / 2 + tempC / 2;
        B = tempA / 2 + tempC / 2;
        C = tempA / 2 + tempB / 2;
        if (A % 2 != 0 || B % 2 != 0 || C % 2 != 0) {
          answer = i;
          break;
        }
      }
    }

    System.out.println(answer);
  }
}
