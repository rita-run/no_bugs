package livecoding_leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    /*
    primitive array
    find max value

    TEST CASES:
    1) POSITIVE
    {1, 2, 3, 4, 5}

    2) EDGE
    {1}
    {2, 2}
    {3, 3, 3}
    {-1, 0, 1}
    {Integer.MIN_}

    3) NEGATIVE
    {}
     */

    public static void main(String[] args) {
        System.out.println(findMax(new int[] {2, 2, 2}));
        System.out.println(findMax(new int[] {1, 2, 3, 4, 5}));
        System.out.println(findMax(new int[] {1}));
        System.out.println(findMax(new int[] {-1, 0}));
        System.out.println(findMax(new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE}));
        System.out.println(findMax(new int[] {}));
    }

    public static int findMax(int[] arr) {
        int firstNumber = arr[0];
        boolean allEqual = true;

        for (int c : arr) {
            if (firstNumber != c) {
                allEqual = false;
                break;
            }
        }

        if (allEqual) throw new IllegalArgumentException("All numbers are the same!");


        return Arrays.stream(arr)
                .boxed()
                .max(Integer::compareTo)
                .orElseThrow(() -> new NullPointerException("Empty array!"));
    }
}