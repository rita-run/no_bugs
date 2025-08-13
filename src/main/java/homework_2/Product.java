package homework_2;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(double discount) {
        this.price = this.price - discount;
    }

    void printInfo() {
        System.out.println("Product's name: " + this.name + ", product's price: " + this.price);
    }
}
