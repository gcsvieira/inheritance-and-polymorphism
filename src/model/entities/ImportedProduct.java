package model.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + getCustomsFee();
    }

    @Override
    public final String priceTag() {
        return getName() + " $ " + String.format("%.f2", getPrice()) + " (Customs fee: $" + getCustomsFee() + ")";
    }

    @Override
    public String toString() {
        return getName() + " $ " + getPrice() + " (Customs fee: $" + getCustomsFee() + ")";
    }

}
