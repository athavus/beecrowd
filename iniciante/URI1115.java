package URI;

import java.util.Scanner;

public class URI1115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else {
                break;
            }
        }
    }
}
