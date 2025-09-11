package homework_10.streamapi.grouping_reduction;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        //1. Группировка строк по первой букве
        //Задача: Напишите программу,
        //которая принимает список строк и группирует их по первой букве,
        //используя Stream API

        List<String> list = List.of("apple", "cherry", "air", "aim", "charity");
        Map<Character, List<String>> groupedList = list.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));
        System.out.println(groupedList);
    }
}
