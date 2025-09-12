package top_livecoding_tasks;

import java.util.Arrays;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        //Is the string a palindrome?
        //Is "Anna" a palindrome? - true
        //Is "java" - false
        //positive: anna, Was it a cat I saw?, a
        //negative: java, " ", "", null
        //Logic: we need to compare the string to its reversed copy

        List<String> list = Arrays.asList("Anna", "Was it a cat I saw?", "a", "Java", " ", "", null);

        list.forEach(str->{
            System.out.println("Is the string \"" + str + "\" a palindrome? - " + isPalindrome(str));
        });


    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleanString = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return new StringBuilder(cleanString).reverse().toString().equals(cleanString);
    }
}
