import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Quantos números você vai digitar? ");
        numero = sc.nextInt();
        double [] vect = new double[numero];

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        System.out.print("VALORES = ");
        for (Double x: vect){
            System.out.printf("%.1f ", x);
        }

        System.out.printf("\nSOMA = %.1f\n", soma);
        double media = soma / vect.length;
        System.out.printf("MEDIA = %.1f\n", media);

        sc.close();


    }
}