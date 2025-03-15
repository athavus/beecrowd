package URI;

import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contPar = 0;
        int contImpar = 0;
        int contPositivo = 0;
        int contNegativo = 0;

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }

            if (num > 0) {
                contPositivo++;
            } else if (num < 0){
                contNegativo++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", contPar);
        System.out.printf("%d valor(es) impar(es)\n", contImpar);
        System.out.printf("%d valor(es) positivo(s)\n", contPositivo);
        System.out.printf("%d valor(es) negativo(s)\n", contNegativo);
    }
}
