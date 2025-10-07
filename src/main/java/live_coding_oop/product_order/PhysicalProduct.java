package live_coding_oop.product_order;

public class PhysicalProduct extends Product {
    private int weight;

    public PhysicalProduct(String name, double price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public int getFileSize() {
        return weight;
    }
}