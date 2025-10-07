package live_coding_oop.product_order;

import java.util.List;

public class Main {
        /*
        STEP 1:
        Order (= manager, stores products and discounts)
        method calculateTotalPrice()

        Product (name, price)
        Digital product (fileSize)
        Physical product (weight)

        Discount (Discountable interface -> method discount())
        percentageDiscount %
        $ (fixed discount)

        goal: create a system for product managment

         STEP 2:
         Use case: order adds product to a cart and calculates the final price

         1) create order
         order.add(dress)
         order.add(hat)

         2)
         add discount 20%
         add discount $10

         3) calculate the final price

         STEP 3:
         Projecting classes and relations

         */
    public static void main(String[] args) {
        Order order = new Order();
        order.addProduct(new DigitalProduct("Lecture", 30, 30));
        order.addProducts(List.of(new PhysicalProduct("Apple", 10, 100), new DigitalProduct("Song", 5, 30)));
        order.addDiscount(new PercentageDiscount(20));
        order.addDiscount(new FixedDiscount(10));
        System.out.println(order.calculateTotalPrice());
    }
}