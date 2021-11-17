package URI;

import java.util.Scanner;

public class URI1116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            double X = scanner.nextInt();
            double Y = scanner.nextInt();

            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(X / Y);
            }
        }
    }
}
