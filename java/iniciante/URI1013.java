package URI;

import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt(), n2 = scanner.nextInt(), n3 = scanner.nextInt();

        int Maior = (((n1 + n2 + Math.abs(n1 - n2)) / 2) + n3 + Math.abs(((n1 + n2 + Math.abs(n1 - n2)) / 2) - n3)) / 2;
        System.out.println(Maior + " eh o maior");
    }
}
