package homework_5.amusement_park;

public class MerryGoRound extends Attraction {
    public MerryGoRound() {
        super("Merry-go-round");
    }

    @Override
    String getCare() {
        return "Care: need to provide tech support";
    }

    @Override
    String getDescription() {
        return "Good for little kids";
    }
}
