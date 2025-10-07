package live_coding_oop.library;

public class Magazine extends Document {
    private int number;

    public Magazine(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public String getInfo() {
        return "Name: " + getName() + ", number: " + number;
    }
}