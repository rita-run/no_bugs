package live_coding_oop.taskManager;

public class Task {
    private String name;
    private boolean isDone;

    public Task(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone() {
        isDone = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}