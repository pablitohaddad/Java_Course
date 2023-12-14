import java.util.Scanner;
public class ScannerAtividade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char f;

        x = sc.next(); // Para ler strings
        y = sc.nextInt(); // Para ler inteiro
        z = sc.nextDouble(); // Para ler double
        f = sc.next().charAt(0); // Para ler char

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(f);

        sc.close(); // Para fechar

    }
}

