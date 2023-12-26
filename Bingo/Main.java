package Bingo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] A = new int[3][];

    A[0] = new int[3];
    A[1] = new int[3];
    A[2] = new int[3];

    A[0][0] = sc.nextInt();
    A[0][1] = sc.nextInt();
    A[0][2] = sc.nextInt();

    A[1][0] = sc.nextInt();
    A[1][1] = sc.nextInt();
    A[1][2] = sc.nextInt();

    A[2][0] = sc.nextInt();
    A[2][1] = sc.nextInt();
    A[2][2] = sc.nextInt();

    boolean[][] card = new boolean[3][3];

    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      int b = sc.nextInt();
      for (int j = 0; j < 3; j++) {
        if (b == A[0][j]) {
          card[0][j] = true;
        }
      }
      for (int k = 0; k < 3; k++) {
        if (b == A[1][k]) {
          card[1][k] = true;
        }
      }
      for (int l = 0; l < 3; l++) {
        if (b == A[2][l]) {
          card[2][l] = true;
        }
      }
    }

    if (isBingo(card)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }

  private static boolean isBingo(boolean card[][]) {
    if (card[0][0] && card[1][0] && card[2][0]) {
      return true;
    } else if (card[0][1] && card[1][1] && card[2][1]) {
      return true;
    } else if (card[0][2] && card[1][2] && card[2][2]) {
      return true;
    }

    if (card[0][0] && card[0][1] && card[0][2]) {
      return true;
    } else if (card[1][0] && card[1][1] && card[1][2]) {
      return true;
    } else if (card[2][0] && card[2][1] && card[2][2]) {
      return true;
    }

    if (card[0][0] && card[1][1] && card[2][2]) {
      return true;
    } else if (card[0][2] && card[1][1] && card[2][0]) {
      return true;
    }

    return false;

  }
}
