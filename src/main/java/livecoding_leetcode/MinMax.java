package livecoding_leetcode;

import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        //[2, 3, 1, 5,4]
        //min = 1
        List<int[]> listOfArrays = List.of(new int[]{2, 3, 1, 5, 4}, new int[]{2, 2}, new int[]{1}, new int[]{-10, 1});
        listOfArrays.forEach(arr -> System.out.println("The max num ib this array is: " +
                findMax(arr) + ", the min num in this list is: " + findMin(arr)));
        findMax(null);
        findMin(new int[]{});
    }


    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) throw new IllegalArgumentException();
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) throw new IllegalArgumentException();
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}