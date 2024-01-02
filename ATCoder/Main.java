package ATCoder;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    boolean isACGT = false;
    int count = 0;
    int tempCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T') {
        if (tempCount == 0) {
          tempCount++;
          isACGT = true;
          if (count < tempCount) {
            count = tempCount;
          }
          continue;
        }
        if (isACGT) {
          tempCount++;
          if (count < tempCount) {
            count = tempCount;
          }
          continue;
        }

      }
      isACGT = false;
      tempCount = 0;
    }
    System.out.println(count);

    sc.close();
  }
}
