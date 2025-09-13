package homework_12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest extends MethodsToCheckTest {
    /*
    3. Разворот строки
Напишите тесты для метода, который переворачивает строку:

public String reverse(String input) {
    if (input == null) return null;
    return new StringBuilder(input).reverse().toString();
}

Тесты должны проверять:
Обычные строки
Пустую строку
null (должно возвращаться null)

Groups of checks:
1) positive checks(=valid input)
- a simple string: "Harry"
- a palindrome: "mom"
- a string with a space: "a b"

2) edge cases
- an empty string: "" -> ""

3) negative cases:
null -> null

Groups for parametrization (= input & output should be similar):
1) All positive + edge cases + negative = just one test
     */
    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                Arguments.of("Harry", "yrraH"),
                Arguments.of("mom", "mom"),
                Arguments.of("a b", "b a"),
                Arguments.of("", ""),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        //create an instance of the class the method of what we need to check
        //to be able to call the method
        //and create  a variable to put the result to
        String reversedString = methodsToCheck.reverse(initialString);

        //we want to compare the reversedString to the expectedString
        assertEquals(expectedString, reversedString);
    }
}