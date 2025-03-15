package URI;

import java.util.Scanner;

public class URI1143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        if (N < 1 || N > 1000) {
            System.exit(0);
        }

        int cont = 1;

        for (int i = 0; i < N; i++) {
            int startCont = cont;

            System.out.print(cont + " ");
            cont *= startCont;
            System.out.print(cont + " ");
            cont *= startCont;
            System.out.println(cont);
            startCont++;
            cont = startCont;
        }
    }
}
