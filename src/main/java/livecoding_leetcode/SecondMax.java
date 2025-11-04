package livecoding_leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class SecondMax {
    public static void main(String[] args) {
        //Find the second max number in an array
        //[1, 4, 3, 2, 5]
        //second max is: 4
        /*
        1) positive case
        2) edge cases:
        2.1) -1, -2
        2.2) 1, 1
         */

//        System.out.println(returnSecondMax(new int[] {1, 4, 3, 2, 5}));
//        System.out.println(returnSecondMax(new int[] {1, -1}));
        System.out.println(returnSecondMax(new int[] {1, 1}));
//        System.out.println(returnSecondMax(new int[] {1}));
//        System.out.println(returnSecondMax(new int[] {}));
//        System.out.println(returnSecondMaxStream(new int[] {1, 4, 3, 2, 5, 5}));
//        System.out.println(returnSecondMinStream(new int[] {1, 4, 3, 2, 5}));
//        System.out.println(returnSecondMaxSteamWNSorting((new int[] {1, 4, 3, 2, 5})));
    }

    public static int returnSecondMax(int[] array) {
        if (array == null || array.length <= 1) throw new IllegalArgumentException("Must be at leas two elements");

        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int n : array) {
            if (n > max) {
                second = max;
                max = n;
            //во втором условии мы ловим числа, которые не максимальные
                // но всё ещё крупнее текущего второго максимума:
            } else if (n > second && n != max) {
                second = n;
            }
        }

        if (second == Integer.MIN_VALUE) { throw new IllegalArgumentException("No second maximum (all elements are equal)");
    }
        return second;
    }

    public static int returnSecondMaxStream(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No 2nd max founded"));
    }

    public static int returnSecondMinStream(int[] arr) {
        if (arr == null || arr.length < 2) throw new IllegalArgumentException("Must be at least 2 elements!");

        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No 2nd min"));
    }

    public static int returnSecondMaxSteamWNSorting(int[] arr) {
        if (arr == null || arr.length < 2) throw new IllegalArgumentException();

        int max = Arrays.stream(arr)
                .max()
                .orElseThrow(NoSuchElementException::new);

        return Arrays.stream(arr)
                .filter(n -> n < max)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
 }