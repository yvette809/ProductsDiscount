package org.example;

public class QuantityDiscount extends BaseDiscount{
    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    protected boolean isApplicable(Product product){
        if(product.getQuantity()>=5){
            return true;
        }
        return false;

    }
    protected  double calculateDiscount(Product product){
        if(product.getQuantity() >=5){
            double discount = product.getQuantity() - (10 * product.getQuantity());
            return discount;
        }
        return product.getPrice();
    }
}
