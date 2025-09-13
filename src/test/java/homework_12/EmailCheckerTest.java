package homework_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailCheckerTest extends MethodsToCheckTest {
    /*
    6. Проверка валидности email
Напишите тесты для метода, который проверяет, является ли строка валидным email:

public boolean isValidEmail(String email) {
    return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
}

Тесты должны проверять:
Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
null

Cases:
1) Positive (=valid data)
- valid email: "test@example.com" -> true

2) Edge
- no such cases

3) Negative (=invalid data)
- invalid email: "bad@.com", "no-at-symbol" -> false
- null -> false

Tests:
1) returns true: Positive
2) returns false: Negative
     */

    @Test
    public void userCanCheckValidEmailReturnsTrue() {
        assertTrue(methodsToCheck.isValidEmail("test@example.com"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
            "bad@.com", "no-at-symbol"
    })
    public void userCanCheckInvalidOrNullEmailReturnsFalse(String email) {
        assertFalse(methodsToCheck.isValidEmail(email));
    }
}
