package URI;

import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if ((A < B + C) && (B < A + C) && (C < B + A)) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = (A + B) * C / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}
