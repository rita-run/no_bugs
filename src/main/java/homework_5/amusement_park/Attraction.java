package homework_5.amusement_park;

abstract public class Attraction {
    private String name;
    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String getCare();

    abstract String getDescription();
}
