package homework_5.museum;

public class Manuscript extends Showpiece {
    public Manuscript(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "It's a very rare and old manuscript";
    }

    @Override
    public String getCare() {
        return "to be kept with controlled humidity";
    }
}
