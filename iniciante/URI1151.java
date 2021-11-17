package URI;

import java.util.Scanner;

public class URI1151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N < 0 || N > 46) {
            System.exit(0);
        }

        int anterior = 0;
        int atual = 1;
        int proximo = 0;

        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.println(anterior);
            } else {
                System.out.print(anterior + " ");
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }
    }
}
