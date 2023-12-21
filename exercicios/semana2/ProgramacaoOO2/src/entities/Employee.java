package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){

        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        double Salary = (grossSalary * (tax / 100)) + (grossSalary - tax);
        System.out.println("Update data: " + name + ", " + Salary);

    }
}
