package Bishop;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();

    long ans = 0;
    if (h == 1 || w == 1) {
      ans = 1;
    } else if ((h * w) % 2 == 0) {
      ans = h * w / 2;
    } else if ((h * w) % 2 != 0) {
      ans = h * w / 2 + 1;
    }

    System.out.println(ans);
    sc.close();

  }
}
