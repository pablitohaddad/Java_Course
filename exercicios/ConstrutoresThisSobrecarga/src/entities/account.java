package entities;

public class account {

    public static final double TAX = 5.00;
    private final int number;
    private String name;
    private final double initialDeposit;

    public account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double putMoney){
        return  (initialDeposit - putMoney) - TAX;
    }

    public void deposit(double takeMoney){
        initialDeposit += takeMoney;
    }

    public String toString(){

        return "Account "
                + getNumber()
                + ", Holder: "
                + getName() +
                ", Balance: $ "
                + String.format("%.2f", getInitialDeposit());

    }
}
