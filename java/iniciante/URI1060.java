package URI;

import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        for (int i = 0; i < 6; i++) {
            double num = scanner.nextDouble();
            if (num > 0) {
                cont++;
            }
        }

        System.out.printf("%d valores positivos\n", cont);
    }
}
