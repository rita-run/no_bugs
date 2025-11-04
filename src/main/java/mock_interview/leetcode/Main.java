package mock_interview.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    [1, 4, 7]
    [2, 5, 7]
    -> [1, 2, 4, 5, 7] arr

    []
    []

    77
    88

    1) put all the nums from 1st arr
    2) list -> sort it
    3) turn back to an arr
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrays(new int[]{1, 4, 7, 9, 10, 19}, new int[]{2, 5, 7})));
    }

    public static int[] arrays(int[] arr1, int[] arr2) {
        if (arr1.length > 5 || arr2.length > 5) throw new IllegalArgumentException();

        List<Integer> list = new ArrayList<>();

        for (int n : arr1) {
            list.add(n);
        }

        for (int n : arr2) {
            list.add(n);
        }

        List<Integer> sortedList = list.stream()
                .sorted()
                .toList();

        int[] targetArr = new int[sortedList.size()];

        for (int i = 0; i < targetArr.length; i++) {
            targetArr[i] = sortedList.get(i);
        }

        return targetArr;
    }
}