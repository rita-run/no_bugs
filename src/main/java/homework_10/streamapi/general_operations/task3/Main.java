package homework_10.streamapi.general_operations.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //3. Преобразование строк в их длины
        //Задача: Напишите программу,
        // которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
        //map(Function [T, R])	- used for transformation

        List<String> listOfStrings = Arrays.asList("Harry", "Ron", "Hermione");
        List<Integer> listOfStringLength = listOfStrings.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());
        System.out.println(listOfStringLength);
    }
}
