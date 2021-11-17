package URI;

import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int vit = 0;
        int emp = 0;
        int der = 0;
        boolean test = true;

        while (true) {

            if (test) {
                int inter = scanner.nextInt();
                int gremio = scanner.nextInt();

                if (inter > gremio) {
                    vit++;
                } else if (gremio > inter) {
                    der++;
                } else {
                    emp++;
                }

                inter = 0;
                gremio = 0;
                total++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            int grenal = scanner.nextInt();

            if (grenal == 2) {
                break;
            } else if (grenal == 1) {
                test = true;
            } else {
                test = false;
            }
        }

        System.out.printf("%d grenais\n", total);
        System.out.printf("Inter:%d\n", vit);
        System.out.printf("Gremio:%d\n", der);
        System.out.printf("Empates:%d\n", emp);

        if (vit > der) {
            System.out.println("Inter venceu mais");
        } else if (vit < der) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}
