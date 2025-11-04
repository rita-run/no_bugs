package homework_8.linked_list;

import java.awt.image.TileObserver;
import java.util.LinkedList;

public class TaskQueue {
    //Задача 2:
    //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

    private LinkedList <String> tasks;

    public TaskQueue() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void processNextTask() {
        if (tasks.isEmpty()) {
            System.out.println("There are no tasks!");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("The next task to showPDF is: " + tasks.getFirst());
            System.out.println("DONE: " + tasks.removeFirst());
            System.out.println();
        }
    }

    public void printTasks() {
        //print the to do list if there are some tasks
        //print All done! if it's empty

        //if the tasks is empty
        if (tasks.isEmpty()) {
            //print All Done!
            System.out.println("All done!");
        } else {
            //overwise print all the tasks!
            System.out.println("TO DO LIST: ");
            tasks.forEach(task -> System.out.println(task));
        }
    }

}
