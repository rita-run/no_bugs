package livecoding_leetcode;

public class WordsCounter {
    public static void main(String[] args) {
        //"And I like my boys playing hard to get"
        //count number of words in the string
        System.out.println(countWords("And I like my boys playing hard to get"));
        System.out.println(countWords("A"));
        System.out.println(countWords(" "));
        System.out.println(countWords(""));
        System.out.println(countWords(" e"));
        System.out.println(countWords("e "));
        System.out.println(countWords(" e "));
        System.out.println(countWords("  "));
        System.out.println(countWords(new String("a").repeat(201)));
    }

    public static long countWords(String str) {
        if (str.length() > 200) throw new IllegalArgumentException("The string length must be less than 200 digits!");
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}