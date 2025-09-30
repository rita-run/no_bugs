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
        Optional<Task<T>> foundTask = taskList.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
        foundTask.ifPresentOrElse(taskList::remove, () -> {
            throw new TaskNotFoundException("Task not found!");
        });
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