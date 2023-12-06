package WannaGoBackHome;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    boolean nFlag = false;
    boolean sFlag = false;
    boolean wFlag = false;
    boolean eFlag = false;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'N') {
        nFlag = true;
      }
      if (s.charAt(i) == 'S') {
        sFlag = true;
      }
      if (s.charAt(i) == 'E') {
        eFlag = true;
      }
      if (s.charAt(i) == 'W') {
        wFlag = true;
      }
    }
    if (nFlag == true && sFlag == false) {
      System.out.println("No");
    } else if (nFlag == false && sFlag == true) {
      System.out.println("No");
    } else if (wFlag == true && eFlag == false) {
      System.out.println("No");
    } else if (wFlag == false && eFlag == true) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
    sc.close();
  }
}
