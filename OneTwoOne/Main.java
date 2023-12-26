package OneTwoOne;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Integer a = sc.nextInt();
    Integer b = sc.nextInt();

    String num = a.toString() + b.toString();

    Integer number = Integer.parseInt(num);

    boolean flag = false;
    for (int i = 1; i < 100100; i++) {
      if (i * i == number) {
        System.out.println("Yes");
        flag = true;
        break;
      }
    }
    if (!flag) {
      System.out.println("No");
    }
    sc.close();
  }
}
