package live_coding_oop.museum;

public abstract class Ticket {
    private double price;

    public Ticket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}