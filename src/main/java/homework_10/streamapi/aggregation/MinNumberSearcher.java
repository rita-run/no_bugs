package homework_10.streamapi.aggregation;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinNumberSearcher {
    public static void main(String[] args) {
        //2. Поиск минимального элемента
        //Задача: Напишите программу,
        //которая принимает список чисел и находит в нем наименьшее число,
        // используя Stream API.

        List<Integer> numbers = List.of(99, 999, 9);
        Optional<Integer> minNumber = numbers.stream()
                .min(Comparator.naturalOrder());

        System.out.println(minNumber.get());
    }
}
