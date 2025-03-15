package URI;

import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble(), B = scanner.nextDouble(), C = scanner.nextDouble();

        if (Math.pow(B, 2) - 4 * A * C > 0) {
            double bask = (B * B) - 4 * A * C;
            double r1 = (-B + Math.sqrt(bask)) / (2 * A);
            double r2 = (-B - Math.sqrt(bask)) / (2 * A);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
