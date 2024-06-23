package NotFound;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
      if (!S.contains(String.valueOf(c))) {
        System.out.println(c);
        sc.close();
        return;
      }
    }
    System.out.println("None");
    sc.close();
  }

}
