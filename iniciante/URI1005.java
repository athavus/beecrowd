package URI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.#####");
        double A = scanner.nextDouble(), B = scanner.nextDouble();

        double MEDIA = (3.5 * A + 7.5 * B) / 11;
        String M = decimal.format(MEDIA);

        System.out.println("MEDIA = " + M);
    }
}
