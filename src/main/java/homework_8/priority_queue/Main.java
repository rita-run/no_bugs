package homework_8.priority_queue;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

        PriorityQueuePrinter printer = new PriorityQueuePrinter();

        printer.addNumber(4);
        printer.addNumber(1);
        printer.addNumber(7);
        printer.addNumber(2);

        printer.printNumbersInOrderOfDeletion();
    }
}
