package entities;

public class Products {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; // this referencia a entidade, e não ao atributo
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }


}
