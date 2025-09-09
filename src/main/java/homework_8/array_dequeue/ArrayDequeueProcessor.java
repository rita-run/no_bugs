package homework_8.array_dequeue;

import java.util.ArrayDeque;

public class ArrayDequeueProcessor {
    //Задача 3:
    //Используйте ArrayDeque как очередь: добавьте
    // элементы в начало и конец, извлеките из обоих концов.

    private ArrayDeque<String> arrayDeque;

    public ArrayDequeueProcessor() {
        this.arrayDeque = new ArrayDeque<>();
    }

    public void addFirstElement(String e) {
        arrayDeque.addFirst(e);
    }

    public void addLastElement(String e) { arrayDeque.addLast(e);}

    public void printQueue() {
        System.out.println("Current queue: " + arrayDeque);
    }

    public void processElementsAtTheEnds() {
        System.out.println("Will be deleted at the beginning: " + arrayDeque.peekFirst());
        System.out.println("Deleted: " + arrayDeque.pollFirst());
        System.out.println("Will be deleted at the end: " + arrayDeque.peekLast());
        System.out.println("Deleted: " + arrayDeque.pollLast());
    }
}
