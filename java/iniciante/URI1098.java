package URI;

import java.text.DecimalFormat;

public class URI1098 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        double cont = 1;
        double initcont = 1;

        for (double i = 0; i <= 2; i+=0.2) {
            if (df.format(i).endsWith("0")) {
                System.out.printf("I=%.0f J=%.0f\n", i, cont);
                cont++;
                System.out.printf("I=%.0f J=%.0f\n", i, cont);
                cont++;
                System.out.printf("I=%.0f J=%.0f\n", i, cont);
            } else {
                System.out.printf("I=%.1f J=%.1f\n", i, cont);
                cont++;
                System.out.printf("I=%.1f J=%.1f\n", i, cont);
                cont++;
                System.out.printf("I=%.1f J=%.1f\n", i, cont);
            }
            initcont += 0.2;
            cont = initcont;
        }
    }
}
