package livecoding_leetcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
Удалить все дубликаты из массива.
[1, 2, 2, 4] -> 1, 2, 4

     */
    public static void main(String[] args) {
        System.out.println(deleteDupes(new int[] {1, 2, 2, 4}));
    }

    public static Set<Integer> deleteDupes(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        return set;
    }
}