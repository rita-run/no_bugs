package homework_10.streamapi.aggregation;

import java.util.*;

public class MaxNumberSearcher {
    public static void main(String[] args) {
        //1. Поиск максимального элемента
        //Задача: Напишите программу,
        //которая принимает список чисел и находит в нём самое большое число, используя Stream API.

        List<Integer> numbers = Arrays.asList(100, 10000, 1001, 10001);
        Optional<Integer> maxNumber = numbers.stream()
                        .max(Comparator.naturalOrder());

        System.out.println(maxNumber.get());
    }
}
