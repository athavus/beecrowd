package URI;

import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        double total;
        double ir;
        double total2;
        double total3;

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000) {
            total = salario - 2000;
            total = ((total * 8) / 100);

            ir = total;
            System.out.printf("R$ %.2f\n", ir);
        } else if (salario >= 3000.01 && salario <= 4500) {
            total = salario - 2000;
            total2 = total - 1000;
            total -= total2;
            total = ((total * 8) / 100);
            total2 = ((total2 * 18) / 100);

            ir = total + total2;
            System.out.printf("R$ %.2f\n", ir);
        } else if (salario > 4500) {
            total = salario - 2000;
            total2 = total - 1000;
            total3 = total2 - 1500;
            total -= total2;
            total2 -= total3;
            total = ((total * 8) / 100);
            total2 = ((total2 * 18) / 100);
            total3 = ((total3 * 28) / 100);

            ir = total + total2 + total3;
            System.out.printf("R$ %.2f\n", ir);
        }
    }
}
