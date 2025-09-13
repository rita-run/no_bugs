package practice_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest extends StringProcessorTest {
    /*
    Tests to check if the string a palindrome:
    positive cases:
    - even number: "abba" - true
    - not even number: "hah" - true
    negative cases:
    - "john" - false
    corner cases:
    - "a" - true
    - "" - true
    - null - IllegalArgumentException
     */

    @ParameterizedTest
    @ValueSource(strings = {
            //positive cases
            "abba", "hah",
            //corner cases
            "a", ""})
    public void userCanCheckIfValidStringIsPalindrome(String initialString) {
        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfValidStringIsNotPalindrome() {
        String initialString = "john";

        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCanNotCheckIfNullStringIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Checking if null string is a palindrome should lead to IllegalArgumentException");
    }
}