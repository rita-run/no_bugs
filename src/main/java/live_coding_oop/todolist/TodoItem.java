package live_coding_oop.todolist;

public class TodoItem {
    private String text;
    private boolean statusDone;

    public TodoItem(String text) {
        this.text = text;
    }

    public boolean isStatusDone() {
        return statusDone;
    }

    public void setStatusDone(boolean statusDone) {
        this.statusDone = statusDone;
    }

    public String getText() {
        return text;
    }
}