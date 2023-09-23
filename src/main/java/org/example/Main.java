package org.example;

public class Main {
    public static void main(String[] args) {
        Product milk= new Product("Milk",10.0,6);
        Product oranges = new Product("oranges",15.0,8);
        Product bread = new Product("bread",8.0,2);

        // create discount chain
        Discount discountChain = new QuantityDiscount(new MilkDiscount(new FridayDiscount(null)));

        // apply discounts
        double milkDiscount = discountChain.apply(milk);
        double orangesDiscount = discountChain.apply(oranges);
        double breadDiscount = discountChain.apply(bread);

        System.out.println("Milk Discount: " + milkDiscount);
        System.out.println("Oranged Discount: " + orangesDiscount);
        System.out.println("bread Discount: " + breadDiscount);

    }
}
