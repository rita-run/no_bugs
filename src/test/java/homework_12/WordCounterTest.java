package homework_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordCounterTest extends MethodsToCheckTest {
    /*
    9. Подсчёт количества слов в строке
Напишите тесты для метода, который считает количество слов в строке:

public int countWords(String sentence) {
    return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
}

Тесты должны проверять:
Пустую строку
null
Строку с несколькими пробелами

Tests
1) String str -> int number
2) null -> Exception
     */
    public static Stream<Arguments> validStringsToCountWords() {
        return Stream.of(
                //positive cases
                Arguments.of("Hello, world!", 2),
                Arguments.of("word", 1),
                Arguments.of("a string with more than two words", 7),
                //edge cases
                Arguments.of(" ", 0),
                Arguments.of("", 0)
                );
    }

    @ParameterizedTest
    @MethodSource("validStringsToCountWords")
    public void userCanCountNumberOfWordsInValidString(String string, int expectedResult) {
        assertEquals(expectedResult, methodsToCheck.countWords(string));
    }

    @Test
    //this test doesn't pass because of unhandled IllegalArgumentException (?)
    //instead there is a NullPointerException
    //that seems to be not very suitable in this case(?)
    public void userCanNotCountNumberOfWordsInNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsToCheck.countWords(null);
        }, "A try to pass null string should cause an IllegalArgumentException exception");
    }
}