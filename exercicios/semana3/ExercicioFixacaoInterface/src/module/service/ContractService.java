package module.service;

import module.entities.Contract;
import module.entities.Installment;

import java.time.LocalDate;

public class ContractService {


    private OnlinePaymentService onlinePaymentService; // ContractService depende do OnlinePaymentService

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){ // adicionarei aqui os installments

        double basicQuota = contract.getTotalValue() / months; // valor sem as taxas

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i); // será a data original, mais 1 mês, por causa da plusMonth

            double interest = onlinePaymentService.interest(basicQuota, i);
            double paymentFee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + paymentFee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }


    }

}
