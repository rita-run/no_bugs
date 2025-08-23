package homework_5.restaurant;

public class Drink extends Dish {
    private double volume;

    public Drink(String name, String description, double volume) {
        super(name, description);
        this.volume = volume;
    }

    @Override
    String getDescription() {
        return super.getDescription() + ", volume " + volume + " ml";
    }
}
