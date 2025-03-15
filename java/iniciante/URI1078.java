package URI;

import java.util.Scanner;

public class URI1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N < 2 || N > 1000) {
            System.exit(0);
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", i, N, N * i);
            }
        }
    }
}
