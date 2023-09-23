package org.example;
import java.time.DayOfWeek;
import java.time.LocalDate;

public  class FridayDiscount extends BaseDiscount{
    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        LocalDate today = LocalDate.now();
        return today.getDayOfWeek()== DayOfWeek.FRIDAY && product.getPrice()>0;

    }

   @Override
   protected  double calculateDiscount(Product product){
       return product.getPrice() * 0.1;

    }
    @Override
    public String getDescription(Product product){
        return "Friday Discount: 10% off";
    }


}
