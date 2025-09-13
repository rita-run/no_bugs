package homework_12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCheckerTest extends MethodsToCheckTest {
    /*
    5. Проверка, является ли год високосным
Напишите тесты для метода, который определяет, является ли год високосным:

public boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

Тесты должны проверять:
Обычные годы
Високосные (2020, 2000, 1600)
Года, которые делятся на 100, но не на 400 (1900, 2100)

Cases:
1) Positive cases (= valid data):
- Non-leap
- Leap (2020, 2000, 1600)

2) Edge cases (= still valid, but boundary)
- Года, которые делятся на 100, но не на 400 (1900, 2100)

3) Negative cases
- no such cases

Tests:
1) expected result = true
1) expected result = false
     */

    @ParameterizedTest
    @ValueSource (ints = {
            //values that will get true as result = leap years
            2020, 2000, 1600
    })
    public void userCanCheckIfLeapYearIsLeap(int year) {
        assertTrue(methodsToCheck.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource (ints = {
            //values that will get false as result: regular non-leap years
            //and edge cases
            2025, 2026, 1900, 2100
    })
    public void userCanCheckIfRegularYearIsNotLeap(int year) {
        assertFalse(methodsToCheck.isLeapYear(year));
    }
}