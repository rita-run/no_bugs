package homework_10.streamapi.general_operations.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //4. Создание списка квадратов чисел
        //Задача: Напишите программу, которая принимает список чисел
        //и преобразует его в новый список, где каждое число заменено на его квадрат, используя Stream API.
        //list of 2 3 4 -> list of 4, 9, 16

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }
}
