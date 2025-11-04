package livecoding_leetcode;

import java.util.ArrayList;
import java.util.List;

public class SortByPrefix {
    /*
    {"apple", "banana", "Anna"} -> apple, Anna
    {" apple", "banana", " Anna"} -> apple, Anna
    {"banana"} -> "No such words!"

    1) go through the list and add each word to a charArr
    2) put all the charArr to a data str
    3) go through the DS and check each first index

     */
    public static void main(String[] args) {
        System.out.println(findByPrefix(new ArrayList<>(List.of("apple", "banana", "Anna"))));
        System.out.println(findByPrefix(new ArrayList<>(List.of(" apple", "banana", " Anna"))));
        System.out.println(findByPrefix(new ArrayList<>(List.of("banana"))));
    }

    public static List<String> findByPrefix(List<String> stringList) {
        List<String> newList = new ArrayList<>();

        for (String s : stringList) {
            if (s.trim().toLowerCase().startsWith("a")) {
                newList.add(s);
            };
        }

        return newList;
    }
}