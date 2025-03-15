package URI;

import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextDouble();
        double coelhos = 0;
        double ratos = 0;
        double sapos = 0;
        double cobaias = 0;

        for (int i = 0; i < N; i++) {
            double Q = scanner.nextDouble();
            char animal = scanner.next().charAt(0);

            switch (animal) {
                case 'C' -> coelhos += Q;
                case 'S' -> sapos += Q;
                case 'R' -> ratos += Q;
            }
            cobaias += Q;
        }

        System.out.printf("Total: %.0f cobaias\n", cobaias);
        System.out.printf("Total de coelhos: %.0f\n", coelhos);
        System.out.printf("Total de ratos: %.0f\n", ratos);
        System.out.printf("Total de sapos: %.0f\n", sapos);

        System.out.printf("Percentual de coelhos: %.2f %s\n", (coelhos / cobaias) * 100, "%");
        System.out.printf("Percentual de ratos: %.2f %s\n", (ratos / cobaias) * 100, "%");
        System.out.printf("Percentual de sapos: %.2f %s\n", (sapos / cobaias) * 100, "%");
    }
}
