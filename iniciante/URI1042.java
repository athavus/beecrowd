package URI;

import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt(), n2 = scanner.nextInt(), n3 = scanner.nextInt();

        int maior = 0;
        int middle = 0;
        int menor = 0;

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else if (n3 > n1 && n3 > n2) {
            maior = n3;
        }

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        } else if (n3 < n1 && n3 < n2) {
            menor = n3;
        }

        if (n1 == menor && n2 == maior) {
            middle = n3;
        } else if (n1 == menor && n3 == maior) {
            middle = n2;
        } else if (n1 == maior && n2 == menor) {
            middle = n3;
        } else if (n1 == maior && n3 == menor) {
            middle = n2;
        } else if (n2 == maior && n3 == menor) {
            middle = n1;
        } else if (n2 == menor && n3 == maior) {
            middle = n1;
        }

        System.out.println(menor);
        System.out.println(middle);
        System.out.println(maior);
        System.out.print("\n");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
