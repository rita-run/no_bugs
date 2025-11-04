package live_coding_oop.restaurant;

public class Order {
    private String dish;
    private int quantity;

    public Order(String dish, int quantity) {
        this.dish = dish;
        this.quantity = quantity;
    }

    public String getDish() {
        return dish;
    }

    public int getQuantity() {
        return quantity;
    }
}