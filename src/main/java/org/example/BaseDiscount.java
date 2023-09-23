package org.example;

public abstract class BaseDiscount implements Discount{

    Discount nextDiscount;
    public BaseDiscount(Discount nextDiscount){
        this.nextDiscount = nextDiscount;

    }
    public double apply(Product product) {
        double productCost = product.getPrice() * product.getQuantity();
        double discountRate = 0.0;
        if (nextDiscount instanceof BaseDiscount) {
            BaseDiscount baseDiscount = (BaseDiscount) nextDiscount;
            if (baseDiscount.isApplicable(product)) {
                discountRate = baseDiscount.CalculateDiscount(product);
            }
        }

        // Calculate the discount amount
        double discount = productCost * discountRate;

        return discount;
    }
    public String getDescription(Product product){
       product = new Product("apples",10.0,5);

       return "";
    }




    protected abstract boolean isApplicable(Product product);
    protected abstract double CalculateDiscount(Product product);

}
