package URI;

import java.util.Scanner;

public class URI1164 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int c = 0; c < n; c++) {
            int num = scanner.nextInt();
            int sum = 0;

            for (int i = 1; i < num; i++)  {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num + " eh perfeito");
            } else {
                System.out.println(num + " nao eh perfeito");
            }
        }


    }
}
