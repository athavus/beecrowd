package URI;

import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int posicao = 1;

        for (int i = 0; i < 100; i++) {
            int N = scanner.nextInt();
            if (i == 0) {
                maior = N;
                posicao = i;
            }

            if (N > maior) {
                maior = N;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao + 1);
    }
}
