package homework_5.botanical_garden;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        Plant orchid = new Orchid("White orchid");
        Plant cactus = new Cactus("Mexican cactus");

        botanicalGarden.addPlant(orchid);
        botanicalGarden.provideCare();
        botanicalGarden.removePlant();

        botanicalGarden.addPlant(cactus);
        botanicalGarden.provideCare();
        botanicalGarden.removePlant();

    }
}
