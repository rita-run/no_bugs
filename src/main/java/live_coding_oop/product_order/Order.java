package live_coding_oop.product_order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private List<Discountable> discounts = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public void addDiscount(Discountable discount) {
        this.discounts.add(discount);
    }

    public void addDiscounts(List<Discountable> discounts) {
        this.discounts.addAll(discounts);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        for(Discountable discount : discounts) {
            totalPrice -= discount.discount(totalPrice);
        }

        return totalPrice;
    }
}