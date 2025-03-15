package URI;

import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble(), B = scanner.nextDouble(), C = scanner.nextDouble();

        double tri = (A * C) / 2;
        double circ = Math.pow(C, 2) * 3.14159;
        double trap = ((A + B) * C) / 2;
        double quadra = B * B;
        double reta = A * B;

        System.out.printf("TRIANGULO: %.3f\n", tri);
        System.out.printf("CIRCULO: %.3f\n", circ);
        System.out.printf("TRAPEZIO: %.3f\n", trap);
        System.out.printf("QUADRADO: %.3f\n", quadra);
        System.out.printf("RETANGULO: %.3f\n", reta);
    }
}
