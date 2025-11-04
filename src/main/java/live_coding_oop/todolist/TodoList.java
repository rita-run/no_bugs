package live_coding_oop.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<TodoItem> todoItems = new ArrayList<>();

    public void addTask(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    public void printDoneTasks() {
        for (TodoItem item : todoItems) {
            if (item.isStatusDone()) {
                System.out.println("Done: " + item.getText());
            }
        }
    }
}