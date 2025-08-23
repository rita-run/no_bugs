package homework_5.amusement_park;

public class RussianRides extends Attraction {
    public RussianRides() {
        super("Russian Rides");
    }

    @Override
    public String getCare() {
        return "Care: need to check security frequently";
    }

    @Override
    String getDescription() {
        return "Very fast and gives the unforgettable feelings";
    }
}
