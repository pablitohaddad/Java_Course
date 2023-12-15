package entities;

public class Products {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; // this.quantity referencia a entidade, e não ao atributo
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
