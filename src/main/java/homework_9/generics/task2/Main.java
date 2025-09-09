package homework_9.generics.task2;

public class Main {
    public static void main(String[] args) {
        //2. Задача на дженерик метод
        //Условие задачи: Напишите дженерик метод printArray,
        // который принимает массив элементов любого типа
        // и выводит каждый элемент массива на консоль.

        ArrayManager arrayManager = new ArrayManager();

        String[] strings = {"element1", "element2", "element3"};
        Integer[] numbers = {1, 2, 3};
        Double[] floatingPointNumbers = {0.2, 0.009, 1.999};

        arrayManager.printArray(strings);
        arrayManager.printArray(numbers);
        arrayManager.printArray(floatingPointNumbers);

    }
}
