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

    public void addElement(String e) {
        arrayDeque.add(e);
    }

    public void processElementsAtTheEnds() {
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peekFirst());
        arrayDeque.pollFirst();
        System.out.println(arrayDeque.peekLast());
        arrayDeque.pollLast();
        System.out.println(arrayDeque);
    }
}
