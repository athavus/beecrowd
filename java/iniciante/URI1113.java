package URI;

import java.util.Scanner;

public class URI1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X > Y) {
                System.out.println("Decrescente");
            } else if (X < Y) {
                System.out.println("Crescente");
            } else {
                break;
            }
        }
    }
}
