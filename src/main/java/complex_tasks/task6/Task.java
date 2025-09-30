package complex_tasks.task6;

import java.time.LocalDate;

public class Task<T> {
    private T id;
    private String status;
    private String priority;
    private LocalDate date;

    public Task(T id, String status, String priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }
}