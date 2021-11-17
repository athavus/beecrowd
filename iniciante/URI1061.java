package URI;

import java.util.Scanner;

public class URI1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringstart = scanner.nextLine();
        int start = Integer.parseInt(stringstart.split(" ")[1]);
        String horario = scanner.nextLine();

        String[] inicio = horario.split(" : ");

        int hh1 = Integer.parseInt(inicio[0]);
        int mm1 = Integer.parseInt(inicio[1]);
        int ss1 = Integer.parseInt(inicio[2]);

        String stringend = scanner.nextLine();
        int end = Integer.parseInt(stringend.split(" ")[1]);

        String horarioFinal = scanner.nextLine();

        String[] termino = horarioFinal.split(" : ");

        int hh2 = Integer.parseInt(termino[0]);
        int mm2 = Integer.parseInt(termino[1]);
        int ss2 = Integer.parseInt(termino[2]);

        int totalDias;
        int totalHoras;
        int totalMinutos;
        int totalSegundos;

        if (hh1 > hh2) {
            totalDias = (end - start) - 1;
            totalHoras = 24 - (hh1 - hh2);
        } else if (hh2 > hh1) {
            totalDias = (end - start);
            totalHoras = (hh2 - hh1);
        } else {
            totalDias = (end - start);
            totalHoras = 0;
        }

        if (mm1 > mm2) {
            totalHoras--;
            totalMinutos = 60 - (mm1 - mm2);
        } else if (mm2 > mm1) {
            totalMinutos = (mm2 - mm1);
        } else {
            totalMinutos = 0;
        }

        if (ss1 > ss2) {
            totalMinutos--;
            totalSegundos = 60 - (ss1 - ss2);
        } else if (ss2 > ss1) {
            totalSegundos = (ss2 - ss1);
        } else {
            totalSegundos = 0;
        }

        System.out.printf("%d dia(s)\n" ,totalDias);
        System.out.printf("%d hora(s)\n", totalHoras);
        System.out.printf("%d minuto(s)\n", totalMinutos);
        System.out.printf("%d segundo(s)\n", totalSegundos);
    }
}
