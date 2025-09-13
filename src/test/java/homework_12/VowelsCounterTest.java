package homework_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VowelsCounterTest extends MethodsToCheckTest {
    /*
    2. Подсчёт количества гласных в строке
Напишите тесты для метода, который считает количество гласных букв в строке:

public int countVowels(String input) {
    if (input == null) {
        throw new IllegalArgumentException("Input cannot be null");
    }
    return (int) input.toLowerCase().chars()
            .filter(c -> "aeiou".indexOf(c) != -1)
            .count();
}

Тесты должны проверять:
Разные строки ("hello", "java", "AEIOU", "")
null (должно выбрасываться исключение)
Строки без гласных

positive (=valid inputs):
"hello" - 2
"AEIOU" - 5
"Hello, world!"
"hi" - 1
"a" - 1
"bbb" - 0

edge cases:
"" - 0
" " - 0

negative(=invalid inputs -> displaying an error)
null - Exception
     */
    public static Stream<Arguments> validStringsToCountVowels() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("Hello, world!", 3),
                Arguments.of("hi", 1),
                Arguments.of("a", 1),
                Arguments.of("bbb", 0),
                Arguments.of(" ", 0),
                Arguments.of("", 0));
    }

    @ParameterizedTest
    @MethodSource("validStringsToCountVowels")
    public void userCanCountVowelsOfValidInput(String stringVowelsToCount, int expectedResult) {
        //first we need to call the method to count the vowels
        //and save the return value in some variable
        int actualResult = methodsToCheck.countVowels(stringVowelsToCount);

        //next we want to check if
        //the actualResult is equals to the expected result
        //to do so we need to use the method:
        // assertEquals(int expected, int actual) {
        //AssertEquals.assertEquals(expected, actual);
        //}
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanNotCountVowelsOfNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsToCheck.countVowels(null);
        }, "Counting vowels of null string should lead to IllegalArgumentException");
    }
}