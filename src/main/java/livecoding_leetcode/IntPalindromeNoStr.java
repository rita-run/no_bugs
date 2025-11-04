package livecoding_leetcode;

public class IntPalindromeNoStr {
    /*
    12321 -> true
    1 -> true
    123 -> false
    11 -> true
    -1 -> false
    010 -> ???
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-1));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(010));
    }

    public static boolean isPalindrome(int n) {
        int rev = 0;
        int original = n;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }
}