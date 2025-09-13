package homework_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxSearcherTest extends MethodsToCheckTest {
    /*
    4. Поиск максимального числа в массиве
Напишите тесты для метода, который находит максимальное число в массиве:

public int findMax(int[] numbers) {
    return Arrays.stream(numbers).max().orElseThrow();
}

Тесты должны проверять:
Обычный массив ([3, 5, 7, 2])
Один элемент в массиве
Отрицательные числа
Пустой массив (должно выбрасываться исключение)

Groups of data to test:
1) Positive cases (= valid input)
- a simple array ([3, 5, 7, 2]) -> 7
- negative numbers [-1, -2, -3] -> -1

2) Edge cases (= still valid, but unfamiliar, extreme,
or boundary conditions that are outside the "happy path" of normal operation)
- one element [1] -> 1

3) Negative
- empty array [] -> Exception

Tests (check possibility of parametrization):
1) Input: array, Output: number -> Positive cases, Edge cases
2) Negative
*/
    public static Stream<Arguments> validArrayToFindMaxIn() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{-1, -2, -3}, -1),
                Arguments.of(new int[]{1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("validArrayToFindMaxIn")
    public void userCanFindMaxValueInValidArray(int[] numbers, int expectedResult) {
        assertEquals(expectedResult, methodsToCheck.findMax(numbers));
    }

    @Test
    public void userCanNotFindValueInEmptyArray() {
        //we need to use the method assertThrows of the following signature:
        //assertThrows(Class<T> expectedType, Executable executable, String message) {
        //        return (T)AssertThrows.assertThrows(expectedType, executable, message);
        //    }
        //- expectedType -> NoSuchElementException.class
        //- executable - lambda expression -> () -> {
        //            methodsToCheck.findMax(int[]);
        //        }
        //- message -> "Some message"
        assertThrows(NoSuchElementException.class, () -> {
                    methodsToCheck.findMax(new int[]{});
                },
        "Searching the max value of an empty array should throw an exception");
    }
}