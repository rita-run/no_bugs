package practice_12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest {
    /*
    Tests for string reversing:
    happy path: rita - > atir
    corner cases:
    "" -> ""
    "a" ->
    null -> IllegalArgument Exception
     */
    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                Arguments.of("rita", "atir"),
                Arguments.of("", ""),
                Arguments.of("a", "a"));
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        String reversedString = stringProcessor.reverse(initialString);

        assertEquals(expectedString, reversedString,
                "We expected result " + expectedString + ", but happened: " + reversedString);

    }

    @Test
    public void userCanNotReverseNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Reversing of null string should lead to IllegalArgumentException");

    }
}