package live_coding_oop.online_shop;

public class ElectronicProduct extends Product {
    public ElectronicProduct(String name, double price) {
        super(name, price + price*0.2);
    }
}