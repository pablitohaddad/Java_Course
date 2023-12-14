import java.util.Scanner;

public class CondicionalTernaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1: preco * 0.05; // Lê se que se o preço for menor que 20, o desconto será o preço x 0.1, se não, o preco x 0.05

        System.out.println("Desconto = " + desconto);

        sc.close();
    }
}