package livecoding_leetcode;

import java.util.*;

public class UniqueWordsInTwoStringsFinder {
    public static void main(String[] args) {
        //return all words from 2 str that met only once in sum of two strings
        //"apple banana cherry"
        //"apple banana mango"
        //-> cherry mango
        //1) concatenate the strings
        //2) get the unique elements
        //3) add in to some ds/string

        //positive:
        //some are u
        //all unique

        //EC:
        //no u

        //neg:
        //empty
        //null
        System.out.println(returnUniqueWords("apple banana cherry", "apple banana mango"));
        System.out.println(returnUniqueWords("apple banana cherry", "peach mango"));
        System.out.println(returnUniqueWords("apple banana cherry", "apple banana cherry"));
        System.out.println(returnUniqueWords(" ", "apple banana cherry"));
        System.out.println(returnUniqueWords("", "apple banana cherry"));
    }

    public static String returnUniqueWords(String str1, String str2) {
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) throw new IllegalArgumentException();

        Map<String, Integer> map = new TreeMap<>();
        List<String> wordList = new ArrayList<>();

        String blendedString = str1 + " " + str2;
        String[] wordsArr = blendedString.split(" ");

        //{"apple", "banana"..}
        for (String word : wordsArr) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        //go through the arr and find the unique words and put the smhere
        for (String string : wordsArr) {
            if (map.get(string) == 1) {
                wordList.add(string);
            }
        }

        if (wordList.isEmpty()) return "There are no unique words!";

        return String.join(" ", wordList);
    }
}