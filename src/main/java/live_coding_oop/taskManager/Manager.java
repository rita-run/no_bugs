package live_coding_oop.taskManager;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        if (!task.isDone()) {
            tasks.add(task);
        }
    }

    public void printTasks() {
        for (Task task : tasks) {
            if (!task.isDone()) {
                System.out.println(task);
            }
        }
        System.out.println();
    }
}