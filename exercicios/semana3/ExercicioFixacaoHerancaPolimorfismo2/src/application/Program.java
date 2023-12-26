package application;

import module.entities.Company;
import module.entities.Individual;
import module.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= N ; i++) {
            System.out.println("Tax payer #" + i + " data");
            System.out.print("Individual or Company (i/c)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            if (resp == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual Income: ");
                Double income = sc.nextDouble();
                System.out.print("Healt expenditures: ");
                Double expendHealt = sc.nextDouble();
                taxPayers.add(new Individual(name, income, expendHealt));
            } else if (resp == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual Income: ");
                Double income = sc.nextDouble();
                System.out.print("Number of Employees ");
                int numberEmployees = sc.nextInt();
                taxPayers.add(new Company(name, income, numberEmployees));
            }
            else {
                System.out.println("Error!");
            }
        }


        double totalTaxes = 0.0;
        for (TaxPayer tp : taxPayers){
            System.out.println(tp);
            totalTaxes += tp.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + totalTaxes);




        sc.close();
    }
}