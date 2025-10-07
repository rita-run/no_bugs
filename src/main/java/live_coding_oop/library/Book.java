package live_coding_oop.library;

public class Book extends Document {
    private String author;

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return "Name: " + getName() + ", author: " + author;
    }
}