package livecoding_leetcode;

import java.util.ArrayList;
import java.util.List;

public class SortedArraysMerger {
    public static void main(String[] args) {
        //merge two sorted arrays
        //{5, 9, 11}
        //{1, 7, 8}
        //result: {1, 5, 7, 8, 9, 11}
        //1) add to an array list
        //2) merge
        //3) sort
        System.out.println(mergeSortedArrs(new int[] {5, 9, 11}, new int[] {1, 7, 8}));
    }

    public static List<Integer> mergeSortedArrs(int[] arr1, int[] arr2) {
        ArrayList<Integer> mergedArr = new ArrayList<>();

        for (int num : arr1) {
            mergedArr.add(num);
        }

        for (int num : arr2) {
            mergedArr.add(num);
        }

        return mergedArr.stream().sorted().toList();
    }
}