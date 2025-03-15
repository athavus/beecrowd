package URI;

import java.util.Scanner;

public class URI1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num < 1 || num > 1000) {
        }

        for (int i = 1; i <= num; i+=2) {
            System.out.println(i);
        }
    }
}
