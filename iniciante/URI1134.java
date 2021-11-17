package URI;

import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;

        while (true) {
            int gasolina = scanner.nextInt();

            if (gasolina == 1) {
                contAlcool++;
            } else if (gasolina == 2) {
                contGasolina++;
            } else if (gasolina == 3) {
                contDiesel++;
            } else if (gasolina == 4) {
                break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", contAlcool);
        System.out.printf("Gasolina: %d\n", contGasolina);
        System.out.printf("Diesel: %d\n", contDiesel);

    }
}
