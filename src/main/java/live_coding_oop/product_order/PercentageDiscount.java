package live_coding_oop.product_order;

public class PercentageDiscount implements Discountable {
    private int persentage;

    public PercentageDiscount(int persentage) {
        this.persentage = persentage;
    }

    @Override
    public double discount(double price) {
        return price * persentage / 100;
    }
}