import java.util.Scanner;
import java.util.Locale;
public class Atividade3 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D , DIFERENCA;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIFERENCA = A * B - C * D;

        System.out.printf("DIFERENCA = %d", DIFERENCA);


        sc.close();

    }
}