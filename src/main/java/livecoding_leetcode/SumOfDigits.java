package livecoding_leetcode;

import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
    int n
    op: sum of digits

    123
    6

    1
    1

    0
    0

    -14
    -5

    Integer.MAX

    1) split to arr od digits -> string -> charArr -> put back to List of Numbs
    2) sum them
     */
    public static void main(String[] args) {
        System.out.println(sum(123));
        System.out.println(sum(1));
        System.out.println(sum(0));
        System.out.println(sum(-14));
        System.out.println(sum(Integer.MAX_VALUE));
    }

    public static int sum(int n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        //'1', '2',
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (char c : arr) {
            list.add(Character.getNumericValue(c));
        }

        for (Integer i : list) {
            sum += i;
        }

        return sum;
    }
}