package livecoding_leetcode;

import java.util.*;

public class FindMissingNumber {
    /*
    found the smallest abscent positive number

    [1, 2] -> 3
    [3, 1, 4] -> 2
    [1] -> 2

    1) sort the arr, filter dict
     1 3 4
    2) take the 1st and compare it with the 2nd -> if next-prev = 1 -> go forvard and compare the 2nd and the d
    3) till next - prev > 1
    4) get the prev + 1 -> return the result

     */
    public static void main(String[] args) {
        System.out.println(findUsingArr(new int[] {1, 3, 4})); //2
        System.out.println(findUsingArr(new int[] {3, 1, 4})); //2
        System.out.println(findUsingArr(new int[] {1}));       //2
        System.out.println(findUsingArr(new int[] {1, 2}));    //3
    }

    public static int findMissing(int[] arr) {
        List<Integer> newArr = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted()
                .toList();

        int missing = 0;

        for (int i = 0; i < newArr.size() - 1; i++) {
            if (newArr.get(i+1) - newArr.get(i) > 1) {
                return newArr.get(i) + 1;
            }
        }
        return newArr.get(newArr.size() - 1) + 1;
    }

    public static int findUsingArr(int[] arr) {
        Set<Integer> set = new TreeSet<>();

        for (int n : arr) {
            set.add(n);
        }

        List<Integer> sortedList = new ArrayList<>(set);

        for (int i = 0; i < sortedList.size() - 1; i++) {
            if(sortedList.get(i) - i > 1) {
                return sortedList.get(i - 1) + 1;
            }
        }
        return sortedList.getLast() + 1;
    }
}