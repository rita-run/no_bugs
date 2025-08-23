package homework_5.aquarium;

abstract public class SeaAnimal {
    private String name;
    final private String behaviour;

    public SeaAnimal(String name, String behaviour) {
        this.name = name;
        this.behaviour = behaviour;
    }

    public String getName() {
        return name;
    }

    public String getBehaviour() {
        return behaviour;
    }
}
