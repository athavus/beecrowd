package URI;

import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();

            if (X < Math.pow(-10, 7) || X > Math.pow(10, 7)) {
                System.exit(0);
            } else {
                if (X == 0) {
                    System.out.println("NULL");
                } else if (X % 2 == 0) {
                    System.out.print("EVEN");
                    if (X > 0) {
                        System.out.println(" POSITIVE");
                    } else {
                        System.out.println(" NEGATIVE");
                    }
                } else if (X % 2 != 0){
                    System.out.print("ODD");
                    if (X > 0) {
                        System.out.println(" POSITIVE");
                    } else {
                        System.out.println(" NEGATIVE");
                    }
                }
            }
        }
    }
}
