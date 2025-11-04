package workbook.stream_api;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//      Print only even numbers from the list
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, -2, -1, -3, 2, 5);
//        List<Integer> onlyEven = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(onlyEven);
//
////      Print only spells that starts with "A"
        List<String> spells = List.of("Expecto patronum!", "Wingardium Leviosa!", "Avada Kedavra");
//        List<String> stringsStartWithA = spells.stream()
//                .filter(spell -> spell.startsWith("A"))
//                .collect(Collectors.toList());
//        System.out.println(stringsStartWithA);
//
//
////      1. Фильтрация строк по длине
////      Из списка строк выбери только те, чья длина больше 5, используя Predicate и stream().filter().
//        List<String> stringOfDifferentLength = List.of("1", "12", "12345", "123456");
//        List<String> wordsWithLengthMoreThan5 = stringOfDifferentLength.stream()
//                .filter(word -> word.length() > 5)
//                .toList();
//        System.out.println(wordsWithLengthMoreThan5);
//
////      2. Преобразование чисел в строки
////      Преобразуй список чисел в список строк с приставкой "Число: " — используй Function.
//        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5);
//        List<String> strings2 = numbers2.stream()
//                .map(n -> "Number: " + n)
//                .toList();
//        System.out.println(strings2);
//
////      Печать всех элементов с Consumer
////      Пройдись по списку и выведи каждый элемент, используя Consumer и forEach().
//        spells.forEach(System.out::println);
//
////        Фильтрация по нескольким условиям
//// Оставь только положительные чётные числа. Используй цепочку filter() с несколькими Predicate.
//        List<Integer> onlyPositiveAndEvenNumbers = numbers.stream()
//                .filter(n -> n > 0 && n % 2 == 0)
//                .toList();
//        System.out.println(onlyPositiveAndEvenNumbers);
//
////5. Сортировка по убыванию
//// Отсортируй список строк по убыванию длины, используя Comparator и sorted().
//        List<String> stringsSortedByLengthDecreasing = stringOfDifferentLength.stream()
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .toList();
//        System.out.println(stringsSortedByLengthDecreasing);

//        7.Получение уникальных элементов
// Из списка чисел убери повторы и отсортируй результат по возрастанию.
//         List<Integer> filteredSortedNums = numbers.stream()
//                 .distinct()
//                 .sorted()
//                 .toList();
//        System.out.println(filteredSortedNums);
//
////        8. Нахождение первого подходящего элемента
//// Найди первую строку, начинающуюся на "A". Используй filter().findFirst().
//        String startsWithA = spells.stream()
//                .filter(string -> string.startsWith("A"))
//                .findFirst()
//                .orElse(null);
//
//        System.out.println(startsWithA);

//        9. Сумма всех элементов
// Сосчитай сумму всех чисел с помощью reduce().

//        int sum = numbers.stream()
//                .reduce(0, Integer::sum);
//        System.out.println(sum);
//
////        10. Проверка условия для всех элементов
//// Проверь, что все числа в списке положительные — используй allMatch().
//        boolean areAllEven = numbers.stream()
//                .allMatch(n -> n > 0);
//        System.out.println(areAllEven);

//        11. Проверка хотя бы одного совпадения
// Есть ли хотя бы одно слово длиной больше 10 символов?
        boolean isTenLetters = spells.stream()
                .anyMatch(s -> s.length() > 10);
        System.out.println(isTenLetters);

//        12. Преобразование объектов в одно поле
// Из списка User получи список всех их email-адресов через map().
//SOLVED

//        Создание списка через Supplier
// Создай список из 5 случайных чисел от 1 до 10, используя Supplier<Integer>.

        
    }
}