package complex_tasks.task6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskServiceTest {
    @Test
    public void userCanAddTask() {
        //List of tasks:
        //index 0: (ID: 1; status: to do; date: 2025-09-26)
        //index 1: (.....)
        //ER: 1
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task = new Task<>(1, "to do", "Medium", LocalDate.of(2025, Month.SEPTEMBER, 26));
        service.addTask(task);
        assertEquals(1, service.returnCopyOfTaskList().getFirst().getId());
    }

    @Test
    public void userCanDeleteTaskById() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, "to do", "Medium", LocalDate.of(2025, Month.SEPTEMBER, 26));
        Task<Integer> task2 = new Task<>(2, "to do", "Medium", LocalDate.of(2025, Month.SEPTEMBER, 26));
        service.addTask(task1);
        service.addTask(task2);
        service.deleteTaskById(1);
        assertEquals(List.of(task2), service.returnCopyOfTaskList());
    }

    @Test
    public void userCanFilterByStatus() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, "to do", "Medium", LocalDate.of(2025, Month.SEPTEMBER, 26));
        Task<Integer> task2 = new Task<>(2, "to review", "Medium", LocalDate.of(2025, Month.SEPTEMBER, 26));
        Task<Integer> task3 = new Task<>(3, "to do", "Medium", LocalDate.of(2025, Month.SEPTEMBER, 26));
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);
        List<Task<Integer>> filteredByStatus = service.filterByStatus("to do");
        assertEquals(List.of(task1, task3), filteredByStatus);
    }

    @Test
    public void userCanFilterByPriority() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, "to do", "Medium", LocalDate.of(2025, Month.SEPTEMBER, 26));
        Task<Integer> task2 = new Task<>(2, "to review", "High", LocalDate.of(2025, Month.SEPTEMBER, 26));
        Task<Integer> task3 = new Task<>(3, "to do", "High", LocalDate.of(2025, Month.SEPTEMBER, 26));
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);
        List<Task<Integer>> filteredByPriority = service.filterByPriority("High");
        assertEquals(List.of(task2, task3), filteredByPriority);
    }

    @Test
    public void userCanSortByDate() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, "to do", "Medium", LocalDate.of(2025, Month.SEPTEMBER, 1));
        Task<Integer> task2 = new Task<>(2, "to review", "High", LocalDate.of(2026, Month.DECEMBER, 11));
        Task<Integer> task3 = new Task<>(3, "to do", "High", LocalDate.of(2024, Month.JANUARY, 20));
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);
        List<Task<Integer>> sortedByDate = service.sortByDate();
        assertEquals(List.of(task3, task1, task2), sortedByDate);
    }
}