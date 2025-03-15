package URI;

import java.util.Scanner;

public class URI1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int N = scanner.nextInt();

        while (N <= 0) {
            N = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += A;
            A++;
        }
        System.out.println(soma);
    }
}
