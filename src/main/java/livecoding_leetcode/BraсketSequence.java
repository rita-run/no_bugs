package livecoding_leetcode;

public class BraсketSequence {
    /*
    Is the Parenthesis sequence balanced?
    (()) -> true
    (() -> false
    ( -> IAE
    ""
    " "
    ((ff))-> true
    ( ( )) - true

    1) clean, trim
    2) add to char arr
    3) cacl number of ( AND )
    3) then compare number ( ) -> should be the same -> true

     */

    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));
        System.out.println(isBalanced("(()"));
        System.out.println(isBalanced("((ff))"));
        System.out.println(isBalanced("( ())"));
        System.out.println(isBalanced("("));
        System.out.println(isBalanced(")("));
    }

    public static boolean isBalanced(String str) {
        String clean = str.replaceAll("[^()]", "").trim();
        char[] arr = clean.toCharArray();
        int balance = 0;

        for (char c : arr) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }

            if (balance < 0) {
                return false;
            }
        }

        return balance == 0;
    }
}