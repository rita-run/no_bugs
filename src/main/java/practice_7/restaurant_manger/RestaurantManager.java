package practice_7.restaurant_manger;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;

    public RestaurantManager(LinkedList<String> orders) {
        this.orders = orders;
    }

    public RestaurantManager() {
        this.orders = new LinkedList<>();
    }

    //add an order to the end of the queue
    public void addNewOrder(String order) {
        orders.addLast(order);
    }

    //process order from the beginning of the queue
    public String getNextOrderForProcess() {
        return orders.poll();
    }

    //delete an order from any place of the queue
    public void deleteOrder(String order) {
        orders.remove(order);
    }

    public void printOrders() {
        System.out.println("All the orders: ");

        orders.forEach(order -> System.out.println(order));
    }


}
