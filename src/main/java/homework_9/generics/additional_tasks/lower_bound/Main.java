package homework_9.generics.additional_tasks.lower_bound;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void addNumbers(List<? super Integer> list, Integer number) {
        list.add(number);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));
        List<Number> numberList = new ArrayList<>(List.of(1.0, 2.0, 3.0));
        List<Object> objectList = new ArrayList<>(List.of(new Object()));

        addNumbers(integerList, 4);
        addNumbers(numberList, 5);
        addNumbers(objectList, 6);
    }
}