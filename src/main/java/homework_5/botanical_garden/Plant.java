package homework_5.botanical_garden;

abstract public class Plant {
    private String name;

    public String getName() {
        return name;
    }

    public Plant(String name) {
        this.name = name;
    }

    abstract String getCareFromGarden();

}
