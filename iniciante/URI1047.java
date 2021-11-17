package URI;

import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();

        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();

        if (h1 == h2 && h1 == m1 && h1 == m2) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else if (h1 > h2) {
            int horas = 24 - (h1 - h2);
            int minutos = 0;
            if (m1 > m2) {
                minutos = 60 - (m1 - m2);
            } else if (m2 > m1) {
                minutos = m2 - m1;
            }

            if (minutos > 0 && m1 > m2) {
                horas--;
            }

            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horas, minutos);
        } else if (h2 > h1) {
            int horas = h2 - h1;
            int minutos = 0;
            if (m1 > m2) {
                minutos = 60 - (m1 - m2);
            } else if (m2 > m1) {
                minutos = m2 - m1;
            }

            if (minutos > 0 && m1 > m2) {
                horas--;
            }
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horas, minutos);
        }
    }
}
