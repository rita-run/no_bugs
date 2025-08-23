package homework_5.restaurant;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(String name, String description, int temperature) {
        super(name, description);
        this.temperature = temperature;
    }

    @Override
    String getDescription() {
        return super.getDescription() + ", temperature " + temperature + " degrees";
    }
}
