package application;

import module.entities.Contract;
import module.entities.Installment;
import module.service.ContractService;
import module.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue); // primeiro criando o contrato, para depois fazer as parcelas

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, n);

        System.out.println("Parcelas:");
        for(Installment installment: contract.getInstallments()) {

            System.out.println(installment);

        }
        sc.close();



    }
}