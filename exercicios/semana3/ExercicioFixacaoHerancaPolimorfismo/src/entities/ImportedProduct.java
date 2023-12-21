package entities;

public class ImportedProduct extends Product {

    private Double customFree;


    public ImportedProduct(){

    }
    public ImportedProduct(String name, Double price, Double customFree) {
        super(name, price);
        this.customFree = customFree;
    }

    public Double getCustomFree() {
        return customFree;
    }

    public void setCustomFree(Double customFree) {
        this.customFree = customFree;
    }

    @Override
    public String priceTag(){

        return getName() + " $ " + getPrice()*customFree + "(Customs fee: $ " + String.format("%.2f ", customFree) + ")";

    }

}
