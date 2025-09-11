package homework_10.streamapi.general_operations.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //2. Фильтрация чисел, кратных 5
        //Задача: Напишите программу, которая принимает список чисел и отбирает только те,
        // которые делятся на 5 без остатка, используя Stream API.
        //filter(Predicate) - filters elements

        List<Integer> listOfNumbers = Arrays.asList(1, 3, 5, 23, 25, 30);
        List<Integer> numbersDividableByFive = listOfNumbers.stream()
                .filter(number -> number % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(numbersDividableByFive);
    }
}
