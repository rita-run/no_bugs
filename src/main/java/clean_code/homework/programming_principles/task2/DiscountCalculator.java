package clean_code.homework.programming_principles.task2;

public class DiscountCalculator {
    /*
    Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.
     */
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.00;

        if (isLoyalCustomer && isFirstPurchase) {
            discount = price * 0.10;
        } else if (hasCoupon) {
            discount = price * 0.07;
        } else if (isLoyalCustomer) {
            discount = price * 0.05;
        } else {
            discount = price * 0.02;
        }
        return price - discount;
    }
}