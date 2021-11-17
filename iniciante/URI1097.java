package URI;

public class URI1097 {
    public static void main(String[] args) {
        int cont = 7;
        int initcont = 7;
        for (int i = 1; i <= 9; i+=2) {
            System.out.println("I=" + i + " J=" + cont);
            cont--;
            System.out.println("I=" + i + " J=" + cont);
            cont--;
            System.out.println("I=" + i + " J=" + cont);
            initcont += 2;
            cont = initcont;
        }
    }
}
