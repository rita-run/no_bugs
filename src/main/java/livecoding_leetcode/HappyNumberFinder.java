package livecoding_leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HappyNumberFinder {
    public static void main(String[] args) {
        //the happy number - a number X that is met in an array X times
        //input: an array, a number
        //find: the max happy number
        //{3, 4, 1, 2, 5, 3, 2, 1}, x = 2 (the number is met 2 times)
        //result: 3

        //1) find all the numbers that are met 2 times
        //2) find the max of them
        System.out.println(findHappyNumber(new int[] {3, 6, 4, 1, 2, 5, 6, 3, 2, 1}, 2));
    }

    public static int findHappyNumber(int[] arr, int x) {
        //1) we need to add all the nums to a map and calculate the values (times met)
        //2) fimd all the values = x
        //3) find the max key = the first

        Map<Integer, Integer> map = new TreeMap<>();
        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
            //3: 2
            //4: 1
        }

        List<Integer> resultArr = new ArrayList<>();

        for (int number : arr) {
            if (map.get(number) == x) {
                resultArr.add(number);
            }
        }

        return resultArr.stream().sorted().toList().reversed().getFirst();
    }
}