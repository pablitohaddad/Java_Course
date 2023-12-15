package Application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n]; // Um vetor tirado de outra classe

        for (int i = 0; i < vect.length ; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice(); // pega o preço de acordo com a posição
        }

        double avg = sum / vect.length; // tamanho do vetor

        System.out.printf("AVAREGE PRICE = %.2f", avg);

        sc.close();
    }
}