package QualificationSimulator;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    sc.nextLine();
    String S = sc.nextLine();

    long passNum = 0;
    long rankInB = 1;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'a') {
        if (passNum < A + B) {
          System.out.println("Yes");
          passNum++;
        } else {
          System.out.println("No");
        }
        continue;
      }

      if (S.charAt(i) == ('b')) {
        if (passNum < A + B && rankInB <= B) {
          System.out.println("Yes");
          passNum++;
          rankInB++;
        } else {
          System.out.println("No");
        }
        continue;
      }

      if (S.charAt(i) == 'c') {
        System.out.println("No");
        continue;
      }
    }
    sc.close();
  }
}
