package URI;

import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cont = 0;
        double total = 0;
        for (int i = 0; i < 6; i++) {
            double num = scanner.nextDouble();
            if (num > 0) {
                cont++;
                total += num;
            }
        }

        double media = total / cont;

        System.out.printf("%.0f valores positivos\n", cont);
        System.out.printf("%.1f\n", media);
    }
}
