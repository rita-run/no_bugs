package livecoding_leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    /*
    act - cat - true
    java - java - true
    hello - world - false

    a - a - true
    Cat - act - true

    ???
    symbols?
    case?

    1) add to charArr
    2) sort
    3) and compare

     */

    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "act"));
        System.out.println(isAnagram("hello", "world"));
        System.out.println(isAnagram("java", "java"));
        System.out.println(isAnagram("a", "a"));
        System.out.println(isAnagram("Cat", "act"));
        System.out.println(isAnagram("", ""));

        System.out.println(isAnagramArraySort("cat", "act"));
        System.out.println(isAnagramArraySort(" cat act", "Act cat"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty()) throw new IllegalArgumentException("String can not be empty!");

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (char c : arr1) {
            list1.add(c);
        }

        for (char c : arr2) {
            list2.add(c);
        }

        list1.sort(null);
        list2.sort(null);

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        } return true;
    }

    public static boolean isAnagramArraySort(String a, String b) {
        String cleanA = a.toLowerCase().replaceAll("\\s+", "");
        String cleanB = b.toLowerCase().replaceAll("\\s+", "");

        char[] ac = cleanA.toCharArray();
        char[] bc = cleanB.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        return Arrays.equals(ac,bc);
    }
}