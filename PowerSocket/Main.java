package PowerSocket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int outlets = 1;
        int taps = 0;

        while (outlets < B) {
            outlets += A - 1;
            taps++;
        }

        System.out.println(taps);
    }
}
