package livecoding_leetcode;

import java.util.Arrays;

public class Main {
    /*
    Find the indexes of numbers, sum of which is the target number
    [1, 8, 10, 11], 12 -> 0, 3

    [1, 8], 10 -> []

    1) get each num and compare ot to each except itself
    2) perform addition and compare result with the target
    3) if it's equal -> retur the indexes
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findInd(new int[]{1, 8, 10, 11}, 12)));
        System.out.println(Arrays.toString(findInd(new int[]{1, 8}, 12)));
    }

    public static int[] findInd(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++){
            for (int y = i + 1; y < arr.length; y++) {
                if (arr[i] + arr[y] == n) {
                    return new int[] {i,y};
                }
            }
        } return new int[0];
    }
}