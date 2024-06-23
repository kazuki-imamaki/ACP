package Coins;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long X = sc.nextLong();
    long count = 0;
    long sum = 0;
    for (int i = 0; i <= A; i++) {
      for (int j = 0; j <= B; j++) {
        for (int k = 0; k <= C; k++) {
          sum = 500 * i + 100 * j + 50 * k;
          if (sum == X) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
    sc.close();
  }
}
