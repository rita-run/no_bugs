package homework_5.farm;

abstract public class FarmAnimal {
    private String name;
    public FarmAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String getCareFromFarmWorker();

    abstract String work();
}
