package homework_10.streamapi.aggregation;

import java.util.List;

public class ElementSearcherByCondition {
    public static void main(String[] args) {
        //5. Проверка наличия хотя бы одного элемента по условию
        //Задача: Напишите программу, которая проверяет,
        //есть ли хотя бы один элемент в списке,
        //который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.

        List<Integer> numbers = List.of(1, 3, 5);
        Boolean isEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(isEven);

    }
}
