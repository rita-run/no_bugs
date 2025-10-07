package livecoding_leetcode;

import java.util.List;

public class NumberOfVowels {
    //"A s d G O I" -> 3
    public static void main(String[] args) {
        List<String> list = List.of("A s d G O", "a", " ", "frj");
        list.forEach(string -> System.out.println("Number of vowels in the string: \"" + string + "\" is: " + calculateNumberOfVowels(string)));
    }

    public static int calculateNumberOfVowels(String str) {
        int numberOfVowels = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) numberOfVowels++;
        }
        return numberOfVowels;
    }
}