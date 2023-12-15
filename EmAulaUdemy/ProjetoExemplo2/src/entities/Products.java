package entities;

public class Products {

    private String name;
    private double price;
    private int quantity;

    public Products(){

    }

    public Products(String name, double price, int quantity){ // um construtor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Products(String name, double price) { // um construtor
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }


    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; // this.quantity referencia ao atributo do objeto
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){

        return name
            + ", $"
            + String.format("%.2f", price) // Coloca o preço em 2 casas decimais, como pedido
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f",totalValueInStock());

    }
}
