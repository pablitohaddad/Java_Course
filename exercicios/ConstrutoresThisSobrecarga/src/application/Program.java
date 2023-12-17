package application;

import entities.account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        String resp = sc.nextLine();

        double initialDeposit = 0.0;
        if (resp.equals("y")){

            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();

        }else {
            System.out.println("Operation invalid");
        }

        account account = new account(number, name, initialDeposit);

        System.out.println();
        System.out.println("Account data:");
        System.out.printf(account.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double putMoney = sc.nextDouble();
        account.deposit(putMoney);

        sc.nextLine();

        System.out.println("Updated account: ");
        System.out.printf(account.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double takeMoney = sc.nextDouble();
        account.withdraw(takeMoney);

        System.out.println("Updated account: ");
        System.out.printf(account.toString());


        sc.close();
    }
}