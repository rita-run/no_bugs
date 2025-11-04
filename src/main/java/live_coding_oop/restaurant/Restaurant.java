package live_coding_oop.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Order> orders = new ArrayList<>();
    private int orderCount;

    public void addOrder(Order order) {
        orders.add(order);
        orderCount++;
    }

    public int getOrderCount() {
        return orderCount;
    }
}