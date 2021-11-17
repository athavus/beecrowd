package URI;

import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(), hour = scanner.nextInt();
        double value = scanner.nextDouble();


        double salary = hour * value;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
