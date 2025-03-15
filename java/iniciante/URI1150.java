package URI;

import java.util.Scanner;

public class URI1150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Z = scanner.nextInt();

        while (Z <= X) {
            Z = scanner.nextInt();
        }

        int cont = 0;
        int soma = 0;

        while (true) {
            soma += X;
            X++;
            cont++;

            if (soma > Z) {
                break;
            }
        }
        System.out.println(cont);
    }
}
