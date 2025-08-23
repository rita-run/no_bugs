package homework_5.botanical_garden;

public class Orchid extends Plant {
    public Orchid(String name) {
        super(name);
    }

    @Override
    public String getCareFromGarden() {
        return "Care: Needs high humidity and shadow. Water it often and keep in shadow";
    }
}
