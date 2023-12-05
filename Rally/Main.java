package Rally;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 人数Nを読み取る
    int N = sc.nextInt();

    // 各人が住んでいる座標を読み取る
    int[] X = new int[N];
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
    }

    sc.close();

    // 座標を昇順にソートする
    Arrays.sort(X);

    // 答えを初期化する
    int ans = Integer.MAX_VALUE;

    // Pを1から100まで試す
    for (int P = 1; P <= 100; P++) {
      int tot = 0;
      for (int i = 0; i < N; i++) {
        tot += Math.pow(X[i] - P, 2);
      }
      ans = Math.min(ans, tot);
    }

    // 結果を出力する
    System.out.println(ans);
  }
}
