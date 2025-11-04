package live_coding_oop.restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Order order1 = new Order("Steak", 2);
        Order order2 = new Order("Cake", 1);
        Order order3 = new Order("Coffee", 1);

        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        System.out.println(restaurant.getOrderCount());

        restaurant.addOrder(order3);

        System.out.println(restaurant.getOrderCount());
    }
}