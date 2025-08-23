package homework_5.restaurant;

public class Dish {
    private String name;
    private String description;

    public Dish(String name, String description) {
        this.description = description;
        this.name = name;
    }

     String getDescription() {
        //name: chiken + temperature: 50 degrees
        return "Name: " + name + ", description: " + description;
    }
}
