package URI;

import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (end > start) {
            int horas = end - start;
            System.out.printf("O JOGO DUROU %d HORA(S\n", horas);
        } else if (end < start) {
            int horas = 24 - (start - end);
            System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
