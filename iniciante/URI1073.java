package URI;

import java.util.Scanner;

public class URI1073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N < 5 || N > 2000) {
            System.exit(0);
        } else {
            for (int i = 2; i <= N; i += 2) {
                System.out.printf("%d^2 = %.0f\n", i, Math.pow(i, 2));
            }
        }
    }
}
