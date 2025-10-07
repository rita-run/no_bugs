package livecoding_leetcode;

public class CharCounter {
    public static void main(String[] args) {
        //"Said your &phone is brok&en, just forgot to &charge it"
        System.out.println(countSymbols("Said your &phone is brok&en, just forgot to &charge it", '&'));
        System.out.println(countSymbols("&", '&'));
        System.out.println(countSymbols("ddd", '&'));
        System.out.println(countSymbols(" ", '&'));
        System.out.println(countSymbols("ff777 ", ' '));
        System.out.println(countSymbols("ff777   ", ' '));
        System.out.println(countSymbols("A a A   ", 'a'));
        System.out.println(countSymbols(null, '&'));
        System.out.println(countSymbols("", '&'));
    }

    public static int countSymbols(String str, char symbol) {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException();
        int count = 0;
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c == symbol) count++;
        }
        return count;
    }
}