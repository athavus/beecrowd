package URI;

import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias = scanner.nextInt();

        int ano = dias / 365;
        dias %= 365;

        int meses = dias / 30;
        dias %= 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
