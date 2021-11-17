package URI;

import java.util.Scanner;

public class URI1145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        if (X > 20 || X < 1) {
            System.exit(0);
        }
        int Y = scanner.nextInt();
        if (Y > 100000 || Y < X) {
            System.exit(0);
        }

        for (int i = 1; i <= Y; i++) {
            if (i % X == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
