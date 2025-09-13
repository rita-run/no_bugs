package homework_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest extends MethodsToCheckTest {
    /*
    7. Факториал числа
Напишите тесты для метода, который вычисляет факториал числа:

public int factorial(int n) {
    if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
    return (n == 0) ? 1 : n * factorial(n - 1);
}
Тесты должны проверять:
0! = 1
Маленькие числа (1!, 5!, 7!)
Отрицательные числа (должно выбрасываться исключение)

Cases:
1) Positive
- 0 -> 1
2) Edge:
- 1 -> 1
- 5 -> 120
- 7 -> 5040
3) Negative:
- negative numbers -> Exception

Tests:
1) Positive + Edge cases
2) negative numbers -> Exception
     */
    public static Stream<Arguments> validNumbersToCalculateFactorial() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("validNumbersToCalculateFactorial")
    public void userCanCalculateFactorialOfValidNumber(int n, int expectedResult) {
        //1) expected 2) actual
        assertEquals(expectedResult, methodsToCheck.factorial(n));
    }

    @Test
    public void userCanNotCalculateFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsToCheck.factorial(-1);
                }, "A try to calculate a factorial of negative number should throw an IllegalArgumentException");
    }
}