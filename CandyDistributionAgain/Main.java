package CandyDistributionAgain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int x = sc.nextInt();
    sc.nextLine();
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      a.add(sc.nextInt());
    }
    sc.close();

    Collections.sort(a);

    int count = 0;
    for (int i = 0; i < N; i++) {
      if (x >= a.get(i)) {
        x = x - a.get(i);
        count++;
      }
      if (count == N && x > 0) {
        count--;
      }
    }
    System.out.println(count);
  }
}
