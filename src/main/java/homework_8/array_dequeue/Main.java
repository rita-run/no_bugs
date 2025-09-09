package homework_8.array_dequeue;

public class Main {
    public static void main(String[] args) {
        //Задача 3:
        //Используйте ArrayDeque как очередь:
        // добавьте элементы в начало и конец, извлеките из обоих концов.

        ArrayDequeueProcessor processor = new ArrayDequeueProcessor();

        processor.addFirstElement("Element 1");
        processor.addLastElement("Element 2");
        processor.addFirstElement("Element 3");
        processor.addLastElement("Element 5");

        processor.printQueue();

        processor.processElementsAtTheEnds();

        processor.printQueue();

    }
}
