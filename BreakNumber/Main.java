import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int inf = -100;
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      int res = i;
      int cnt = 0;
      if (i == 1) {
        ans = 1;
      } else if (i % 2 != 0) {
        continue;
      } else {
        while (res % 2 == 0) {
          res /= 2;
          cnt++;
          if (cnt > inf) {
            inf = cnt;
            ans = i;
          }
        }
      }

    }
    System.out.println(ans);
  }

}
