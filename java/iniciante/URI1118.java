package URI;

import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 2;
        double total = 0;
        boolean test = true;

        while (true) {
            if (test) {
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


            System.out.println("novo calculo (1-sim 2-nao)");
            int solicit = scanner.nextInt();

            if (solicit == 2) {
                break;
            } else if (solicit == 1) {
                test = true;
                cont = 2;
                total = 0;
            } else {
                test = false;
            }
        }
    }
}
