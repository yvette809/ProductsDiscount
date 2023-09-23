package org.example;

import java.time.LocalDate;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private LocalDate purchaseDate;

    public Product(String name,double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.purchaseDate= LocalDate.now();
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public LocalDate getPurchaseDate(){
        return purchaseDate;
    }


}
