package org.example;

public  class MilkDiscount extends BaseDiscount{
    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product){
        return product.getName().equalsIgnoreCase("milk");

    }
    @Override
    protected  double calculateDiscount(Product product){
        return product.getPrice() * 0.05;

    }
    @Override
    public String getDescription(Product product){
        if(isApplicable(product)){
            return nextDiscount.getDescription(product);
        }
        return "No Friday discount applicable";

    }

}
