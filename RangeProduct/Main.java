package RangeProduct;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    if (a < 0 && b > 0) {
      System.out.println("Zero");
    }
    if (a > 0) {
      System.out.println("Positive");
    }
    if (b < 0) {
      int range = -a - b + 1;
      if (range % 2 == 0) {
        System.out.println("Positive");
      } else {

        System.out.println("Negative");
      }
    }
  }
}
