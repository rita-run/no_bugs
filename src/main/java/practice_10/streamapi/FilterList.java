package practice_10.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {
    public static void main(String[] args) {
        //1. Create a list of whole numbers, next filter all the even numbers
        //and print the sum of all the numbers
        //Intermediate operation: filtering by parity
        //Terminal operation: addition

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        IntStream stream = numbers.stream()
                .filter(n -> {
                    System.out.println("filter: " + n);
                    return n % 2 == 0;
                })
                .mapToInt(n -> {
                    System.out.println("mapToInt: " + n);
                    return n;
                });

        System.out.println("Stream is created but terminal method is not called yet");
        int sum = stream.sum();

        System.out.println(sum);
    }
}
