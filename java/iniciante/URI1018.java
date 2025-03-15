package URI;

import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int start = value;
        int cont100, cont50, cont20, cont10, cont5, cont2, cont1;

        cont100 = value / 100;
        value %= 100;

        cont50 = value / 50;
        value %= 50;

        cont20 = value / 20;
        value %= 20;

        cont10 = value / 10;
        value %= 10;

        cont5 = value / 5;
        value %= 5;

        cont2 = value / 2;
        value %= 2;

        cont1 = value;

        System.out.println(start);
        System.out.println(cont100 + " nota(s) de R$ 100,00");
        System.out.println(cont50 + " nota(s) de R$ 50,00");
        System.out.println(cont20 + " nota(s) de R$ 20,00");
        System.out.println(cont10 + " nota(s) de R$ 10,00");
        System.out.println(cont5 + " nota(s) de R$ 5,00");
        System.out.println(cont2 + " nota(s) de R$ 2,00");
        System.out.println(cont1 + " nota(s) de R$ 1,00");

    }
}
