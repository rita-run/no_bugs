package homework_9.generics.task2;

public class ArrayManager {
    //2. Задача на дженерик метод
    //Условие задачи: Напишите дженерик метод printArray,
    // который принимает массив элементов любого типа
    // и выводит каждый элемент массива на консоль.

    public <T> void printArray(T[] someArray) {
        for (T element : someArray) {
            System.out.println(element);
        }
    }
}
