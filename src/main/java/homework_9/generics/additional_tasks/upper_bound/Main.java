package homework_9.generics.additional_tasks.upper_bound;

import java.util.List;

public class Main {
    public static <T extends Number> void sum(List<T> list) {
        double sum = 0;
        for(T element : list) {
            sum += element.doubleValue();
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(0.1, 0.2, 0.3);

        sum(integerList);
        sum(doubleList);
    }
}
