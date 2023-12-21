package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department; // uma associação com a classe Department (1 somente)
    private List<HourContract> contracts = new ArrayList<>(); //

    /*
    linha 16:
    uma associação com a classe HourContract (use lista qnd mais de 1)
    deve ser instanciado também. NAO INCLUA NO CONSTRUTOR UMA LISTA.
    */

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
    /*

    Não use um setContracts (quando for lista) pois assim voce estaria trocando uma lista
    por outra lista, pois quando se tem setContracts(List<>), se cria uma outra lista na
    memória

     */

    public void addContract (HourContract contract){
        contracts.add(contract); // adiciona o contract realizado na lista contracts
    }

    public void removeContract (HourContract contract){
        contracts.remove(contract); // assim como adicionar, eu removo
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance(); // para instanciar os horarios do sistema atual
        for (HourContract c : contracts){ // para cada hora do contrato faça
            cal.setTime(c.getDate()); // configura o objeto Calendar com a data do contrato
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH); // + 1 pois o mes começa com 0
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }



}
