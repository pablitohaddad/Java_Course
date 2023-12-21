package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= N ; i++) {
            System.out.println("Product #" + i + " data:" );
            System.out.print("Common, used or imported (c/u/i)? ");
            char cui = sc.next().charAt(0);
            sc.nextLine();
            if (cui == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                list.add(new Product(name, price));
            }
            else if (cui == 'u'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            }
            else{
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Custom fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p: list){
            System.out.println(p.priceTag());
        }

        sc.close();


    }
}