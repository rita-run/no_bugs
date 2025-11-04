package live_coding_oop.product_filter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product dress = new Product("Dress", 1000.00);
        Product skort = new Product("Skirt", 1000.00);
        Product hat = new Product("Hat", 900.00);
        shop.addProducts(List.of(dress,skort, hat));
        System.out.println(shop.filterProducts(0.00));
    }
}