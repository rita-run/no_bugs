package live_coding_oop.library;

import java.util.Date;

public class Newspaper extends Document {
    private Date date;

    public Newspaper(String name, Date date) {
        super(name);
        this.date = date;
    }

    @Override
    public String getInfo() {
        return "Name: " + getName() + ", date: " + date;
    }
}