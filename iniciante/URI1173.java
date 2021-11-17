package URI;

import java.util.Scanner;

public class URI1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] N = new int[10];
        int V = scanner.nextInt();

        if (50 <= V) {
        } else {
            N[0] = V;

            for (int i = 1; i < N.length; i++) {
                V = V * 2;
                N[i] = V;
            }

            for (int i = 0; i < N.length; i++) {
                System.out.println("N[" + i + "]" + " = " + N[i]);
            }
        }
    }
}
