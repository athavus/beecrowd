package URI;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.####");
        double raio = scanner.nextDouble();

        double n = 3.14159;

        double a = n * Math.pow(raio, 2);

        String area = decimal.format(a);
        System.out.println("A=" + area);
    }
}
