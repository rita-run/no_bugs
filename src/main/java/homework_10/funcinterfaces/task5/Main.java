package homework_10.funcinterfaces.task5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //5. Использование Consumer
        //Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
        //Consumer<T>
        //Функциональный интерфейс,
        //принимающий параметр и ничего не возвращающий (используется для выполнения действия).

        Consumer<String> stringToPrint = s -> System.out.println(s);
        stringToPrint.accept("No bugs");
    }
}
