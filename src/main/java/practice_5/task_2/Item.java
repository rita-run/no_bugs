package practice_5.task_2;

import practice_5.task_1.Printable;

public class Item implements Printable {
    private String name;
    private double price;
    private int count;

    public Item(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void print() {
        System.out.println("My item: " + this.name + this.price + this.count);
    }
}
