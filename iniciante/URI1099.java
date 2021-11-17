package URI;

import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X > Y) {
                for (int j = Y+1; j < X; j++) {
                    if (j % 2 != 0) {
                        total += j;
                    }
                }
            } else if (X < Y) {
                for (int j = X+1; j < Y; j++) {
                    if (j % 2 != 0) {
                        total += j;
                    }
                }
            }
            System.out.println(total);
            total = 0;
        }
    }
}
