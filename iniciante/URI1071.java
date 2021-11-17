package URI;

import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int sum = 0;

        if (n1 > n2) {
            for (int i = n2 + 1; i < n1; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else if (n2 > n1) {
            for (int i = n1 + 1; i < n2; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);
    }
}
