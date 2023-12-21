package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();
        System.out.print("Email: ");
        String emailClient = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthClient = sdf.parse(sc.next());
        Client client = new Client(nameClient, emailClient, birthClient);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        sc.nextLine();

        Order order = new Order(new Date(), status, client); // new Date pois o pedido sera agora


        System.out.print("How many items to this order? ");
        int numberOrders = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=numberOrders; i++){

            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, new Product(nameProduct, priceProduct));
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        sc.close();



    }
}