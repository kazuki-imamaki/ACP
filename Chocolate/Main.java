package Chocolate;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int result = d;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; (j * a[i]) + 1 <= d; j++) {
        result++;
      }
    }
    System.out.println(result);

  }
}
