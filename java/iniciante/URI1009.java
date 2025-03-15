package URI;

import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double sales = scanner.nextDouble();
        double commission = sales * 0.15;

        double total = salary + commission;

        System.out.printf("TOTAL = R$ %.2f\n", total);

    }
}
