package livecoding_leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntPalindrome {
    /*
    return true if int value is a palindrome

    123321 -> true
    1 - true
    22 true
    22222 true
    -101 true

    12355 -> false

    1) reverse the number - how? - add to a string?
    2) check if reversed == the original
     */
    public static void main(String[] args) {
        System.out.println(isIntPalindrome(Integer.MAX_VALUE));
        System.out.println(isIntPalindrome(Integer.MIN_VALUE));
        System.out.println(isIntPalindrome(123321));
        System.out.println(isIntPalindrome(12355));
        System.out.println(isIntPalindrome(1));
        System.out.println(isIntPalindrome(22));
        System.out.println(isIntPalindrome(-101));


        System.out.println(isIntPalindromeStringBuilder(123321));
        System.out.println(isIntPalindromeStringBuilder(12355));
        System.out.println(isIntPalindromeStringBuilder(1));
        System.out.println(isIntPalindromeStringBuilder(22));
        System.out.println(isIntPalindromeStringBuilder(-101));
    }

    public static boolean isIntPalindrome(int initialNum) {
        String initialNumAsString = String.valueOf(initialNum);
        char[] array = initialNumAsString.toCharArray();
        List<Character> list = new ArrayList<>();

        for (char c : array) {
            if (!(c == '-')) {
                list.add(c);
            }
        }

        return (list.equals(list.reversed()));
    }

    public static boolean isIntPalindromeStringBuilder(int initialNum) {
        if(initialNum < 0) {
            initialNum *= -1;
        }
        String s = Integer.toString(initialNum);
        StringBuilder stringBuilder = new StringBuilder(s);
        String reversed = stringBuilder.reverse().toString();
        return s.equals(reversed);
    }
}