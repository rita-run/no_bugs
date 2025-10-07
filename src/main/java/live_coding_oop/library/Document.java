package live_coding_oop.library;

public class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return "Info on the doc";
    }
}