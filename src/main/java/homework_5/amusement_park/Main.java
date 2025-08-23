package homework_5.amusement_park;

public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();

        Attraction russianRides = new RussianRides();
        Attraction merryGoRound = new MerryGoRound();

        amusementPark.addAttraction(russianRides);
        amusementPark.provideCare();
        amusementPark.printInfo();
        amusementPark.removeAttraction();

        amusementPark.addAttraction(merryGoRound);
        amusementPark.provideCare();
        amusementPark.printInfo();
        amusementPark.removeAttraction();
    }
}
