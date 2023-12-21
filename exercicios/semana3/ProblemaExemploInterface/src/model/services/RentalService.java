package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;
    private TaxService taxService; // para que não dependa do Brasil agora a classe nao sabe (não deve mesmo) qual implementação será feita

    public RentalService(){

    }

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes(); // diferença entre os horarios
        double hours = minutes / 60.0;

        double basicPayment;
        if(hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else{
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax  = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }

}
