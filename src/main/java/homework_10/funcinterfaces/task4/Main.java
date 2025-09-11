package homework_10.funcinterfaces.task4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //4. Лямбда-выражение с Function
        //Задача: Создайте лямбду, которая принимает строку и возвращает её длину.

        Function<String, Integer> stringLength = s -> s.length();

        System.out.println(stringLength.apply("1234567890"));
        System.out.println(stringLength.apply("1"));
    }
}
