package homework_9.generics.additional_tasks.general_method;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Обобщённый метод
        //Задача: Реализуйте метод printList(List<T>),
        // который принимает список любого типа и выводит его элементы.

        List<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        printList(stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        printList(integerList);

    }

    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
