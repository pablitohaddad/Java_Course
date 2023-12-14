package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products product = new Products();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine(); // quando digitar, será guardado na proxima linha
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + "," + product.price + "," + product.quantity);

        sc.close();
    }
}