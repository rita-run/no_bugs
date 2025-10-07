package livecoding_leetcode;

import java.util.HashSet;
import java.util.List;

public class DeleteDupes {
    public static void main(String[] args) {
        //string list = apple, banana, apple, cherry
        //apple, banana, cherry

        List<String> words = List.of("apple", "banana", "apple", "cherry");
        HashSet<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
}