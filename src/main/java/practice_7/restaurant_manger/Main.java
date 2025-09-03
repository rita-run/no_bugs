package practice_7.restaurant_manger;

public class Main {
    public static void main(String[] args) {
        RestaurantManager restaurantManager = new RestaurantManager();

        restaurantManager.addNewOrder("French fries");
        restaurantManager.addNewOrder("Milkshake");
        restaurantManager.addNewOrder("Cocktail");
        restaurantManager.printOrders();

        restaurantManager.deleteOrder("Milkshake");
        restaurantManager.printOrders();

    }
}
