package live_coding_oop.online_shop;

public class Manager {
    private Product product;

    public Manager(Product product) {
        this.product = product;
    }

    public String addProduct() {
        return "Product is added! " + product.getName();
    }

    public String  printPrice() {
        return "Price of the " + product.getName() + ": " + product.getPrice();
    }
}