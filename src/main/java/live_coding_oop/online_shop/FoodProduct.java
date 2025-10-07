package live_coding_oop.online_shop;

public class FoodProduct extends Product {
    public FoodProduct(String name, double price) {
        super(name, price + price*0.1 - price*0.05);
    }
}