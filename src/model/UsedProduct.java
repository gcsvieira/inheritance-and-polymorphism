package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Product;

public class UsedProduct extends Product {
    private final DateTimeFormatter standardFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = LocalDate.parse(manufactureDate, standardFmt);
    }

    public LocalDate getManufactureDate() {
        return this.manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

}
