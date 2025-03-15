package URI;

import java.util.Scanner;

public class URI1133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start > end) {
            for (int i = end + 1; i < start; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else if (end > start) {
            for (int i = start + 1; i < end; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println();
        }
    }
}
