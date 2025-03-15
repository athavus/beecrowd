package URI.iniciante.page1;

import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora = scanner.nextInt(), velocidade = scanner.nextInt();

        double total = velocidade * hora;

        double gasolina = total / 12;

        System.out.printf("%.3f\n", gasolina);
    }
}
