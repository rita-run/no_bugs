package homework_10.streamapi.grouping_reduction;

import java.util.List;
import java.util.stream.Collectors;

public class FindTheMeanOfNumbers {
    public static void main(String[] args) {
        //3. Поиск среднего значения чисел
        //Задача: Напишите программу,
        //которая принимает список чисел и находит их среднее значение, используя Stream API.

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Double mean = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(mean);
    }
}
