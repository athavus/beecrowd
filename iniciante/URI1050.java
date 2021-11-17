package URI;

import java.util.Scanner;

public class URI1050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ddd = scanner.nextInt();

        int[] DDDs = new int[8];
        String[] cidades = new String[8];

        DDDs[0] = 61; DDDs[1] = 71; DDDs[2] = 11; DDDs[3] = 21;
        DDDs[4] = 32; DDDs[5] = 19; DDDs[6] = 27; DDDs[7] = 31;

        cidades[0] = "Brasilia"; cidades[1] = "Salvador"; cidades[2] = "Sao Paulo"; cidades[3] = "Rio de Janeiro";
        cidades[4] = "Juiz de Fora"; cidades[5] = "Campinas"; cidades[6] = "Vitoria"; cidades[7] = "Belo Horizonte";

        boolean a = false;

        for (int i = 0; i < 8; i++) {
            if (ddd == DDDs[i]) {
                System.out.println(cidades[i]);
                a = true;
            }
        }

        if (a) {
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
