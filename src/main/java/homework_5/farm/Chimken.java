package homework_5.farm;

public class Chimken extends FarmAnimal{
    public Chimken(String name) {
        super(name);
    }

    @Override
    String getCareFromFarmWorker() {
        return "gets grains";
    }

    @Override
    String work() {
        return "gives eggs";
    }
}
