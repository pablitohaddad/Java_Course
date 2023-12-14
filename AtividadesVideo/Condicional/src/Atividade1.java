import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NÃO NEGATIVO");        }


        sc.close();
    }
}