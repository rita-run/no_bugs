package live_coding_oop.todolist;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        TodoItem homework = new TodoItem("Homework");
        TodoItem groceries = new TodoItem("Grocery shopping");
        TodoItem dogWalk = new TodoItem("Walk the dog");

        todoList.addTask(homework);
        todoList.addTask(groceries);
        todoList.addTask(dogWalk);

//        homework.setStatusDone(true);
//        groceries.setStatusDone(true);

        todoList.printDoneTasks();
    }
}