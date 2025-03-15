package URI;

import java.util.Scanner;

public class URI1180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor = 0;
        int posicao = 0;
        int num = scanner.nextInt();

        int[] listNum = new int[num];

        for (int i = 0; i < listNum.length; i++) {
            listNum[i] = scanner.nextInt();
        }

        for (int i = 0; i < listNum.length; i++) {
            if (i == 0) {
                menor = listNum[i];
            } else {
                if (menor > listNum[i]) {
                    menor = listNum[i];
                    posicao = i;
                }
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

    }
}
