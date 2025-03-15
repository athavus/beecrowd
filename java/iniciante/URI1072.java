package URI;

import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int in = 0;
        int out = 0;

        if (num > 10000) {
            System.exit(0);
        } else {
            for (int i = 0; i < num; i++) {
                int X = scanner.nextInt();
                if (X > (Math.pow(10, 7)) && X < (Math.pow(-10, 7))) {
                    System.exit(0);
                } else {
                    if (X >= 10 && X <= 20) {
                        in++;
                    } else {
                        out++;
                    }
                }
            }
            System.out.printf("%d in\n", in);
            System.out.printf("%d out\n", out);
        }
    }
}
