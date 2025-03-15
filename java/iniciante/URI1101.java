package URI;

import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int soma = 0;

            if (N <= 0 || M <= 0) {
                break;
            } else {
                if (M > N) {
                    for (int i = N; i <= M; i++) {
                        if (i == M) {
                            System.out.print(i);
                        } else {
                            System.out.print(i + " ");
                        }
                        soma += i;
                    }
                    System.out.println(" Sum=" + soma);
                } else if (N > M) {
                    for (int i = M; i <= N; i++) {
                        if (i == N) {
                            System.out.print(i);
                        } else {
                            System.out.print(i + " ");
                        }
                        soma += i;
                    }
                    System.out.println("Sum=" + soma);
                }
            }
        }
    }
}
