package homework_8.priority_queue;

import java.util.PriorityQueue;

public class PriorityQueuePrinter {
    //Задача 1:
    //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
    private PriorityQueue<Integer> priorityQueue;

    public PriorityQueuePrinter() {
        this.priorityQueue = new PriorityQueue<>();
    }

    public void addNumber(Integer number) {
        priorityQueue.add(number);
    }

    public void printNumbersInOrderOfDeletion() {
        System.out.println(priorityQueue);
        //we don't know yet how many times the cycle should run,
        //because we do not have any elements in our collection yet
        //so it is better to use the while cycle
         while (!priorityQueue.isEmpty()) {
            System.out.println("The next number for deletion is: " + priorityQueue.peek());
            priorityQueue.poll();
        }
    }
}
