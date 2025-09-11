package homework_10.funcinterfaces.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //3. Лямбда-выражение с Predicate
        //Задача: Напишите лямбду, которая проверяет, является ли число чётным.
        ParityChecker<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.checkParity(1));
        System.out.println(isEven.checkParity(2));

    }
}
