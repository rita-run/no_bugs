package complex_tasks.task6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class TaskService<T> {
    List<Task<T>> taskList = new LinkedList<>();

    public List<Task<T>> returnCopyOfTaskList() {
        return List.copyOf(taskList);
    }

    public void addTask(Task<T> task) {
        taskList.add(task);
    }

    public synchronized void deleteTaskById(T id) {
        //1) we go through the task list and search for the task with id we passed as argument
        //2) we try to remove it with removeIf method, and if removed it'll return true
        //3) if method did not return true -> exception
        if (!taskList.removeIf(task -> task.getId().equals(id))) {
            throw new IllegalArgumentException("Task not found!");
        }
    }

    public List<Task<T>> filterByStatus(String status) {
        return taskList.stream()
                .filter(t -> t.getStatus().equals(status))
                .toList();
    }

    public List<Task<T>> filterByPriority(String priority) {
        return taskList.stream()
                .filter(t -> t.getPriority().equals(priority))
                .toList();
    }

    public List<Task<T>> sortByDate() {
        return taskList.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .toList();
    }
}