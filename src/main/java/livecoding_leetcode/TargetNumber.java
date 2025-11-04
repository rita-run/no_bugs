package livecoding_leetcode;

import java.util.Arrays;

public class TargetNumber {
    /*
    [1, 2, 3, 4, 5], 6 -> 2, 4
    [1, 2], 3 -> 1,2
    [1]
    []
    [1,2], 10 ->

    1)
    1 + 2 = 3 == 6? -> skip
    1 + 3 = 4 ==
    2 + 3 = 5 == 6

     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNums(new int[] {1, 2, 3, 4, 5}, 6)));
    }

    public static int[] findNums(int[] arr, int n) {
        for (int y = 0; y < arr.length; y++) {
            for (int i = y + 1; i < arr.length; i++) {
                if (arr[y] + arr[i] == n) {
                    return new int[]{arr[y], arr[i]};
                }
            }
        } return new int[0];
    }
}