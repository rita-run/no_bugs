package top_livecoding_tasks;

import practice_9.library.Library;

import java.util.HashSet;
import java.util.List;

public class DistinctChars {
    public static void main(String[] args) {
        //check if there are only unique symbols in the string
        //hello world - false
        //world - true

        List<String> list = List.of("World", "hello", "a  b", " ", "");

        list.forEach(str -> {
            System.out.println("Are all the symbols in the string \"" + str + "\" unique? - " + ifAllCharsUnique(str));
        });

    }

    public static boolean ifAllCharsUnique(String str) {
        /*1) divide the str to chars
        2) put all the chars to data structure
        3) compare each char to the rest -> put them to set -> unique
        4) if char.equals(c) = false
        5) else = true
         */
        char[] chars = str.toCharArray();

        HashSet<Character> set = new HashSet<>();

        for (char c : chars) {
            //add returns true if there is such element
            //if we put the c to set and there already was such a char -> true -> false (=the str was not unique)
            if(!set.add(c)) return false;
        }
        return true;
    }
}
