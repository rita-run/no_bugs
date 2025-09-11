package homework_10.streamapi.general_operations.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Фильтрация строк по длине больше 5
        //Задача: Напишите программу,
        // которая принимает список строк и удаляет из него все строки длиной 5 символов и менее,
        // используя Stream API.

        List<String> fruits = List.of("cherry", "peach", "strawberry", "kiwi");

        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredFruits);
    }


}
