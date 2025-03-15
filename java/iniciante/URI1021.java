package URI;

import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();
        double cont100, cont50, cont20, cont10, cont5, cont2, moeda100, moeda50, moeda25, moeda10, moeda5, moeda1;

        cont100 = value / 100;
        value %= 100;

        cont50 = value / 50;
        value %= 50;

        cont20 = value / 20;
        value %= 20;

        cont10 = value / 10;
        value %= 10;

        cont5 = value / 5;
        value %= 5;

        cont2 = value / 2;
        value %= 2;

        moeda100 = value;
        value %= 1;

        value = value * 100;

        moeda50 = value / 50;
        value %= 50;

        moeda25 = value / 25;
        value %= 25;

        moeda10 = value / 10;
        value %= 10;

        moeda5 = value / 5;
        value %= 5;

        moeda1 = value;

        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", Math.floor(cont100));
        System.out.printf("%.0f nota(s) de R$ 50.00\n", Math.floor(cont50));
        System.out.printf("%.0f nota(s) de R$ 20.00\n", Math.floor(cont20));
        System.out.printf("%.0f nota(s) de R$ 10.00\n", Math.floor(cont10));
        System.out.printf("%.0f nota(s) de R$ 5.00\n", Math.floor(cont5));
        System.out.printf("%.0f nota(s) de R$ 2.00\n", Math.floor(cont2));
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", Math.floor(moeda100));
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", Math.floor(moeda50));
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", Math.floor(moeda25));
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", Math.floor(moeda10));
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", Math.floor(moeda5));
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", Math.floor(moeda1));

    }
}
