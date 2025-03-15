package URI;

import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double start;

        if (B > A && B > C) {
            start = A;
            A = B;
            B = start;
        } else if (C > A)  {
            start = A;
            A = C;
            C = start;
        }

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((A * A) == (B * B) + (C * C) ) {
                System.out.println("TRIANGULO RETANGULO");
            } else if ((A * A) > (B * B) + (C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if ((A * A) < (B * B) + (C * C)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ((A == B && A != C) || (A == C && A != B) || (B == C && A != B)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
