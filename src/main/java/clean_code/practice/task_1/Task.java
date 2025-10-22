package clean_code.task_1;

import java.util.Date;

class Task {
    private String title;
    private String description;
    private Date dueDate;
    private boolean isCompleted = false;
    private User user;

    public Task(String title, String description, Date dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public User getUser() {
        return user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
