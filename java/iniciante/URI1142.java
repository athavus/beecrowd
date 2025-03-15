package URI;

import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cont = 0;

        for (int i = 0; i < N; i++) {
            cont++;
            System.out.print(cont + " ");
            cont++;
            System.out.print(cont + " ");
            cont++;
            System.out.print(cont + " ");
            cont++;
            System.out.println("PUM");
        }
    }
}
