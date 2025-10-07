package complex_tasks.task5;

import java.util.*;

public class InventoryService {
    //key: clothes, value (=list of products): (t-shirt, skort, dress)
    //key: food, value: (chips, fruits, meat)
    private Map<String, List<Product>> inventoryList = new HashMap<>();
    private boolean isInventoryOpen;

    public void setInventoryOpen(boolean inventoryOpen) {
        isInventoryOpen = inventoryOpen;
    }

    public Map<String, List<Product>> getInventoryListCopy() {
        return new HashMap<>(inventoryList);
    }

    public void addProduct(String category, Product product) {
        if (isInventoryOpen) {
            inventoryList.computeIfAbsent(category, k -> new ArrayList<Product>());
            inventoryList.get(category).add(product);
        } else throw new InventoryIsClosedException("Inventory is closed!");
    }

    public void getProductByCategory(String category, String productName) {
        if (category == null) throw new IllegalArgumentException("No such category!");
        //get the list of products by category
        List <Product> productsList = inventoryList.get(category);
        //from this list get the product needed by name
        //list: product1 (name1, price, category), product2 (name2..)
        Optional<Product> foundProduct = productsList.stream()
                .filter(product -> product.getName().equals(productName))
                .findFirst();
        foundProduct.ifPresentOrElse(productsList::remove, () -> {
            throw new OutOfStockException("Out of stock!");
        });
    }
}