import java.util.Scanner;

public class BitWise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b100000; // numero mask
        int n = sc.nextInt();

        if ((n & mask) != 0 ) { // Verifica se o 6 bit do número é 1 ou 0
            System.out.println("6th bit is True");
        }else{
            System.out.println("6th bit is False");
        }


        sc.close();
    }
}