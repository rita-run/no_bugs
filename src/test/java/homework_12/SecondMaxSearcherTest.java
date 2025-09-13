package homework_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SecondMaxSearcherTest extends MethodsToCheckTest {
    /*
    8. Поиск второго максимального числа в массиве
Напишите тесты для метода, который находит второе по величине число:

public int findSecondMax(int[] numbers) {
    return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
}

Тесты должны проверять:
Обычные массивы
Массив с одинаковыми числами
Один элемент в массиве (должно выбрасываться исключение)

Tests:
1) int[] -> int number:
simple array: new int[] {1, 4, 2, 3, 5} -> 4
array with duplicates: int[] new {1, 4, 4, 2, 3, 5, 5} -> 4
2) NoSuchElementException:
array of single element: new int[] {1} -> Exception
empty array
     */
    public static Stream<Arguments> validArraysToFindSecondMaxIn() {
        return Stream.of(
                Arguments.of(new int[] {1, 4, 2, 3, 5}, 4),
                Arguments.of(new int[] {5, 1}, 1),
                //there is a bug in the findSecondMax() method because
                //first we call the .distinct() to create array of distinct values
                //but then call .skip() and yet again manipulate the initial numbers array
                //so it doesn't make sense
                //the following cases won't pass because of the bug
                Arguments.of(new int[] {5, 5, 5}, 1),
                Arguments.of(new int[] {1, 4, 4, 2, 3, 5, 5}, 4));
    }

    public static Stream<Arguments> invalidArrays() {
        return Stream.of(
                Arguments.of(new int[] {1}),
                Arguments.of(new int[] {})
        );
    }

    @ParameterizedTest
    @MethodSource("validArraysToFindSecondMaxIn")
    public void userCanFindSecondMaxInValidArray(int[] numbers, int expectedResult) {
        assertEquals(expectedResult, methodsToCheck.findSecondMax(numbers));
    }

    @ParameterizedTest
    @MethodSource("invalidArrays")
    public void userCanNotFindSecondMaxInArrayOfSingleElement(int[] array) {
        //there is an unmanaged IllegalArgumentException exception that occurs when calling the method with
        //the following test data: int[] {1}, int[] {}
        //that's why the test doesn't pass
        assertThrows(NoSuchElementException.class, () -> {methodsToCheck.findSecondMax(array);},
                "A try to find a second max value of single element array should throw NoSuchElementException");
    }
}