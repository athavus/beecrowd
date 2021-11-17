package URI;

import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < 6; i++) {
            if (num % 2 == 0) {
                num++;
            }
            System.out.println(num);
            num += 2;
        }
    }
}
