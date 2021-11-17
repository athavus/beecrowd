package URI;

import java.util.Scanner;

public class URI1146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int X = scanner.nextInt();

            if (X == 0) {
                break;
            }

            for (int i = 1; i <= X; i++) {
                if (i == X) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
