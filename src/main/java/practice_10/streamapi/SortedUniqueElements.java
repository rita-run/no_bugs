package practice_10.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SortedUniqueElements {
    public static void main(String[] args) {
        //list with duplicate elements
        //we need to print all the unique elements in sorted order

        List<Integer> numbers = Arrays.asList(3, 2, 3, 4, 2, 5);

        List<Integer> uniqueSorted = numbers.stream()
                .distinct()
                .peek(n -> System.out.println("distinct: " + n))
                .sorted()
                .peek(n -> System.out.println("sorted: " + n))
                .collect(Collectors.toList());


        System.out.println(uniqueSorted);
    }


}

