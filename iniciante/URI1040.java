package URI;

import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double n1 = scanner.nextDouble() * 2;
        double n2 = scanner.nextDouble() * 3;
        double n3 = scanner.nextDouble() * 4;
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 10;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double exam = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exam);
            double finalmedia = (media + exam) / 2;

            if (finalmedia > 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f", finalmedia);
        } else if (media > 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }
    }
}
