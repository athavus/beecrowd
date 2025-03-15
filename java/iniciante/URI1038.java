package URI;

import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total;
        int code = scanner.nextInt();
        int qtt = scanner.nextInt();
        double price = 0;

        if (code == 1) {
            price = 4;
        } else if (code == 2) {
            price = 4.5;
        } else if (code == 3) {
            price = 5;
        } else if (code == 4) {
            price = 2;
        } else if (code == 5) {
            price = 1.5;
        }

        total = price * qtt;

        System.out.printf("Total: R$ %.\n", total);
    }
}
