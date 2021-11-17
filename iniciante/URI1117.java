package URI;

import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 2;
        double total = 0;

        while (cont != 0) {
            double N = scanner.nextDouble();

            if (N > 10 || N < 0) {
                System.out.println("nota invalida");
            } else {
                total += N;
                cont--;
            }

        }
        System.out.printf("media = %.2f\n", total / 2);
    }
}
