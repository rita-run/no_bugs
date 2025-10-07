package livecoding_leetcode;

import java.util.*;

public class UniqueSymbolSearcher {
    public static void main(String[] args) {
        //find the 1st unique symbol in the string and return its index
        //hello -> h -> 0
        //mama -> -1
        //1) add all the symbols of the string to an array
        //2) check each symbol - is it unique?
        //3) if yes -> get the index and return
        //if no -> nothing
        System.out.println(findFirstUniqueSymbolIndex("hello"));
        System.out.println(findFirstUniqueSymbolIndex("mama"));
        System.out.println(findFirstUniqueSymbolIndex("m"));
        System.out.println(findFirstUniqueSymbolIndex(""));
    }

    public static int findFirstUniqueSymbolIndex(String str) {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException();

        Map<Character, Integer> symbols = new TreeMap<>();

        char[] arr = str.toCharArray();
        for (char c : arr) {
            symbols.put(c, symbols.getOrDefault(c, 0) + 1);
        }
        //h: 1
        //e: 1
        //l: 2

        //we need to go through the array of chars and check each char for uniqueness = get each char and use it as a key
        //and search its value in the map = 1
        //a, b , c [0, 1, 2], length = 3
        for (int i = 0; i < arr.length; i++) {
            if (symbols.get(arr[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}