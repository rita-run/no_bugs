package livecoding_leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LetterFrequency {
    /*
    banana
    b: 1
    a: 3
    n: 2

    1) split the str to chars and add to arr
    2) add all the chars to a map. letter: frequency
     */
    public static void main(String[] args) {
        countLetters("banana");
    }

    public static void countLetters(String s) {
        char[] chars = s.toCharArray();
        Map <Character, Integer> map = new LinkedHashMap<>();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}