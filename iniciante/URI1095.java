package URI;

public class URI1095 {
    public static void main(String[] args) {
        int cont = 1;
        for (int i = 60; i >= 0; i -= 5) {
            System.out.printf("I=%d ", cont);
            cont += 3;
            System.out.printf("J=%d\n", i);
        }
    }
}
