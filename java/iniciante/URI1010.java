package URI;

import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int code1 = scanner.nextInt();
        int tam1 = scanner.nextInt();
        double value1 = scanner.nextDouble();

        int code2 = scanner.nextInt();
        int tam2 = scanner.nextInt();
        double value2 = scanner.nextDouble();

        double total = (tam1 * value1) + (tam2 * value2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
