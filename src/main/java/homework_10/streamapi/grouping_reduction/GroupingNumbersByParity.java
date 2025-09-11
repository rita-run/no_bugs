package homework_10.streamapi.grouping_reduction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingNumbersByParity {
    public static void main(String[] args) {
        //2. Группировка чисел по чётности
        //Задача: Напишите программу, которая принимает
        //список чисел и группирует их на чётные и нечётные, используя Stream API.

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        Map<Boolean, List<Integer>> sortedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(sortedNumbers);
    }
}
