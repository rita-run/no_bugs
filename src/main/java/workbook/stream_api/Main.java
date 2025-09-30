package workbook.stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//      Print only even numbers from the list
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, -2, -1, -3);
        List<Integer> onlyEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(onlyEven);

//      Print only spells that starts with "A"
        List<String> spells = List.of("Expecto patronum!", "Wingardium Leviosa!", "Avada Kedavra");
        List<String> stringsStartWithA = spells.stream()
                .filter(spell -> spell.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(stringsStartWithA);


//      1. Фильтрация строк по длине
//      Из списка строк выбери только те, чья длина больше 5, используя Predicate и stream().filter().
        List<String> stringOfDifferentLength = List.of("1", "12", "12345", "123456");
        List<String> wordsWithLengthMoreThan5 = stringOfDifferentLength.stream()
                .filter(word -> word.length() > 5)
                .toList();
        System.out.println(wordsWithLengthMoreThan5);

//      2. Преобразование чисел в строки
//      Преобразуй список чисел в список строк с приставкой "Число: " — используй Function.
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5);
        List<String> strings2 = numbers2.stream()
                .map(n -> "Number: " + n)
                .toList();
        System.out.println(strings2);

//      Печать всех элементов с Consumer
//      Пройдись по списку и выведи каждый элемент, используя Consumer и forEach().
        spells.stream()
                .forEach(spell -> System.out.println(spell));

//        Фильтрация по нескольким условиям
// Оставь только положительные чётные числа. Используй цепочку filter() с несколькими Predicate.
        List<Integer> onlyPositiveAndEvenNumbers = numbers.stream()
                .filter(n -> n > 0 && n % 2 == 0)
                .toList();
        System.out.println(onlyPositiveAndEvenNumbers);

//5. Сортировка по убыванию
// Отсортируй список строк по убыванию длины, используя Comparator и sorted().
        List<String> stringsSortedByLengthDecreasing = stringOfDifferentLength.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
        System.out.println(stringsSortedByLengthDecreasing);
    }
}