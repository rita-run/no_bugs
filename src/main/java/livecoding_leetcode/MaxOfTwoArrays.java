package livecoding_leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //input: 2 arrays
        //output: max number of 2 arrays
        //1) merge arrays
        //2) add to array list to fin max

        System.out.println(findMax(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
    }

    public static int findMax(int[] arr1, int[] arr2) {
        List<Integer> mergedArr = new ArrayList<>();

        for (int num : arr1) {
            mergedArr.add(num);
        }

        for (int num : arr2) {
            mergedArr.add(num);
        }

        return mergedArr.stream().sorted().toList().reversed().getFirst();
    }
}