package org.example;

public class QuantityDiscount extends BaseDiscount{
    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product){
       return product.getQuantity()>=5;

    }
    @Override
    protected  double calculateDiscount(Product product){
        return 10.0 * product.getQuantity();
        }

    @Override
    public String getDescription(Product product) {
        if (isApplicable(product)) {
            String nextDescription = nextDiscount.getDescription(product);
            return "Quantity Discount: SEK 10 off per product (if >= 5 products)\n" + nextDescription;
        } else {
            return "No quantity discount applicable";
        }
    }
}
