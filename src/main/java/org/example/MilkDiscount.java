package org.example;

public  class MilkDiscount extends BaseDiscount{
    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    protected boolean isApplicable(Product product){
        if(product.getName()=="Milk"){
            return true;

        }
        return false;

    }
    protected  double CalculateDiscount(Product product){
        double discount = 0.05 * product.getPrice();
        return discount;

    }

}
