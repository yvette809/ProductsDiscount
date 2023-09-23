package org.example;

public interface Discount {
    public double apply(Product product);
    public String getDescription(Product product);
}
