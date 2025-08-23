package homework_5.museum;

public class Sculpture extends Showpiece {
    public Sculpture(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "It's an ancient Greece sculpture";
    }

    @Override
    public String getCare() {
        return "get restoration";
    }
}
