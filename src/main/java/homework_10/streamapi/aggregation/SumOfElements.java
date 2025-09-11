package homework_10.streamapi.aggregation;

import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        //3. Сумма всех элементов списка
        //Задача: Напишите программу,
        //которая принимает список чисел и вычисляет их сумму, используя Stream API.

        List<Integer> numbers = List.of(30, 50, 50, 20);
        Integer sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
