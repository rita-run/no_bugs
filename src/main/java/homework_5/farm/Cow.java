package homework_5.farm;

public class Cow extends FarmAnimal {
    public Cow(String name) {
        super(name);
    }

    @Override
    String getCareFromFarmWorker() {
        return "being herd";
    }

    @Override
    String work() {
        return "gives milk";
    }
}
