package homework_8.array_dequeue;

public class Main {
    public static void main(String[] args) {
        //Задача 3:
        //Используйте ArrayDeque как очередь:
        // добавьте элементы в начало и конец, извлеките из обоих концов.

        ArrayDequeueProcessor processor = new ArrayDequeueProcessor();

        processor.addElement("Element 1");
        processor.addElement("Element 2");
        processor.addElement("Element 3");
        processor.addElement("Element 5");
        processor.addElement("Element 6");

        processor.processElementsAtTheEnds();
    }
}
