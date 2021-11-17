package URI;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.###");
        int X = scanner.nextInt();
        double Y = scanner.nextDouble();

        double consume = X / Y;
        String consumo = decimal.format(consume);
        System.out.println(consumo + " km/l");
    }
}
