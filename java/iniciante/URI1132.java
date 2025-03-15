package URI;

import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int soma = 0;

        if (start > end) {
            for (int i = end; i <= start; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        } else if (end > start){
            for (int i = start; i <= end; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }

        System.out.println(soma);
    }
}
