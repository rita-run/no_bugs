package clean_code.practice.task_2;

public class Product {
    private String name;
    private double price;
    private boolean isInStock;
    private int quantity;

    public Product(String name, double price, boolean isInStock, int quantity) {
        this.name = name;
        this.price = price;
        this.isInStock = isInStock;
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public int getQuantity() {
        return quantity;
    }
}