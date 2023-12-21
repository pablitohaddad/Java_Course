import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b && a % b == 0) {
            System.out.println("MULTIPLOS");
        } else if (b > a && b % a == 0) {
            System.out.println("MULTIPLOS");
        }else{
            System.out.println("NÃO MULTIPLOS");
        }


        sc.close();
    }
}