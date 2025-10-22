package mock_interview.litcode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    /*
        int [int] 1st not repeating number
        [2 2 1 3] -> 1
        [2 1 3]
        [5 5 4 5] -> 4

        [2 2 2] -> -1
        [2] -> 2

        [] -> -1

        [0 0 2] - 2

        [1 2 3 2 1 4] -> 3

        1) go through arr and put all the el to map
        2) get all the values where value = 1 -> put it to an arr
        3) get the 1st el
         */
    public static void main(String[] args) {
        System.out.println(firstNumber(new int[] {2, 2, 1, 3}));
        System.out.println(firstNumber(new int[] {2, 1, 3}));
        System.out.println(firstNumber(new int[] {5, 5, 4, 5}));
        System.out.println(firstNumber(new int[] {2, 2, 2}));
        System.out.println(firstNumber(new int[] {2}));
        System.out.println(firstNumber(new int[] {}));
        System.out.println(firstNumber(new int[] {1, 2, 3, 2, 1, 4}));
    }

    public static int firstNumber(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                arrayList.add(entry.getKey());
            }
        }

        if (arrayList.isEmpty()) {
            return -1;
        } else return arrayList.getFirst();
    }
}