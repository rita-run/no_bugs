package homework_10.streamapi.general_operations.task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //5. Удаление дубликатов из списка
        //Задача: Напишите программу,
        //которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.

        List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 3, 88, 1000, 3, 33);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers);

    }
}
