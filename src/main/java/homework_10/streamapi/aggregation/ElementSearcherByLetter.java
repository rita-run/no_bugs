package homework_10.streamapi.aggregation;

import java.util.List;
import java.util.stream.Collectors;

public class ElementSearcherByLetter {
    public static void main(String[] args) {
        //4. Поиск первого элемента, начинающегося на "Б"
        //Задача: Напишите программу,
        //которая принимает список строк и находит первую строку,
        //начинающуюся на букву "Б", используя Stream API.

        List<String> list = List.of("cat", "bear", "bubble");
        String bWord = list.stream()
                .filter(str -> str.startsWith("b"))
                .collect(Collectors.toList())
                .get(0);
        System.out.println(bWord);
    }
}
