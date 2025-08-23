package homework_5.botanical_garden;

public class Cactus extends Plant {
    public Cactus(String name) {
        super(name);
    }

    @Override
    String getCareFromGarden() {
        return "Care: Needs sunlight and needs to be watered rarely. Keep in the sunlight and water rarely";
    }
}
