package TollGates;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int[] A = new int[n + 1];
    int count1 = 0;
    int count2 = 0;
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      A[a]++;
    }
    for (int i = x; i <= n; i++) {
      count1 += A[i];
    }
    for (int i = x; i >= 0; i--) {
      count2 += A[i];
    }
    System.out.println(Math.min(count1, count2));
    sc.close();
  }
}
