package homework_8.linked_list;

public class Main {
    public static void main(String[] args) {
        //Задача 2:
        //Реализуйте очередь задач с LinkedList.
        // Добавьте 3 задачи и обработайте их в порядке поступления.

        /*
        TaskQueue tasks = new TaskQueue();
        tasks.addTask("To do laundry");
        tasks.addTask("To do homework");
        tasks.addTask("To pet the cat");

        tasks.printTasks();
        tasks.processNextTask();
        tasks.printTasks();
        tasks.processNextTask();
        tasks.printTasks();
        tasks.processNextTask();
        tasks.printTasks();

         */

        //Задача 5:
        //Используйте ListIterator для прохода по LinkedList в обоих направлениях.


        MyListIterator myListIterator = new MyListIterator();

        myListIterator.addElement(4);
        myListIterator.addElement(45);
        myListIterator.addElement(101);
        myListIterator.addElement(8);
        myListIterator.addElement(55555);

        myListIterator.iterateMyList();

    }
}
