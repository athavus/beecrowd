package URI;

import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double perc = 0;
        double reac;

        if (salario >= 0 && salario <= 400) {
            perc = 0.15;
        } else if (salario >= 400.01 && salario <= 800) {
            perc = 0.12;
        } else if (salario >= 800.01 && salario <= 1200) {
            perc = 0.10;
        } else if (salario >= 1200.01 && salario <= 2000) {
            perc = 0.07;
        } else if (salario > 2000) {
            perc = 0.04;
        }
        reac = salario * perc;
        salario += reac;

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reac);
        System.out.printf("Em percentual: %.0f %s\n", perc * 100, "%");
    }
}
