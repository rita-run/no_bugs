package homework_5.restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Dish salat = new Dish("salat", "veggie salat");

        restaurant.addDish(salat);
        restaurant.printDishDescription();
        restaurant.removeDish(salat);

        Dish soup = new HotDish("soup", "mushroom soup", 50);

        restaurant.addDish(soup);
        restaurant.printDishDescription();
        restaurant.removeDish(soup);

        Dish tea = new Drink("tea", "green tea", 200);

        restaurant.addDish(tea);
        restaurant.printDishDescription();
        restaurant.removeDish(tea);
    }
}