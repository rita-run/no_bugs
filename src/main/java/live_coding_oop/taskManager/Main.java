package live_coding_oop.taskManager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Task homework = new Task("Do homework");
        Task clean = new Task("Clean");
        Task wash = new Task("Wash clothes");

        wash.setDone();

        manager.addTask(homework);
        manager.addTask(clean);
        manager.addTask(wash);

        manager.printTasks();

        clean.setDone();

        manager.printTasks();
    }
}