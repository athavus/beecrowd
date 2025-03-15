package URI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.#");
        double A = scanner.nextDouble(), B = scanner.nextDouble(), C = scanner.nextDouble();

        double MEDIA = (2 * A + 3 * B + 5 * C) / 10;
        String M = decimal.format(MEDIA);

        System.out.println("MEDIA = " + M);
    }
}
