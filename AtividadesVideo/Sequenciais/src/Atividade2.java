import java.util.Scanner;
import java.util.Locale;
public class Atividade2 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;
        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("Area = %.4f", area);

        sc.close();

    }
}