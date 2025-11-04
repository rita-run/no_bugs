package live_coding_oop.product_filter;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(List<Product> productList){
        products.addAll(productList);
    }

    public List<Product> filterProducts(double price) {
        List<Product> filteredList = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > price) {
                filteredList.add(product);
            }
        }
        return filteredList;
    }
}