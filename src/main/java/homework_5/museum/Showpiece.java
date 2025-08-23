package homework_5.museum;

abstract public class Showpiece {
    private String name;

    public Showpiece(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String getDescription();

    abstract String getCare();
}
