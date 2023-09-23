package org.example;
import java.time.DayOfWeek;

public  class FridayDiscount extends BaseDiscount{
    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    protected boolean isApplicable(Product product) {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek purchaseDayOfWeek = product.getPurchaseDate().getDayOfWeek();
        return purchaseDayOfWeek ==friday ? true: false;


    }


    protected  double CalculateDiscount(Product product){
        double discount = 0.1 * product.getPrice();
        return discount;

    }


}
