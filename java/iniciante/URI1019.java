package URI;

import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int seg = scanner.nextInt();

       int hour = seg / 3600;
       seg -= hour * 3600;

       int min = seg / 60;

       seg = seg - (min * 60);

       System.out.println(hour + ":" + min + ":" + seg);
    }
}
