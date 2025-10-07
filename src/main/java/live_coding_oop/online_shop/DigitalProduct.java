package live_coding_oop.online_shop;

public class DigitalProduct extends Product {
    public DigitalProduct(String name, double price) {
        super(name, price - price*0.15);
    }
}