package live_coding_oop.product_order;

public class DigitalProduct extends Product {
    private int fileSize;

    public DigitalProduct(String name, double price, int fileSize) {
        super(name, price);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }
}