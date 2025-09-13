package homework_12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberValidationTest extends MethodsToCheckTest {
    /*
    10. Проверка валидности номера телефона

Напишите тесты для метода, который проверяет валидность телефонного номера:

public boolean isValidPhoneNumber(String phone) {
    return phone.matches("\\+\\d{1,3} \\d{10}");
}

Тесты должны проверять:
Корректные номера ("+1 1234567890")
Некорректные номера ("12345", "invalid")

Tests:
1) true: String phone -> true
2) false: String phone -> false
     */

    @ParameterizedTest
    @ValueSource(strings = {
            //positive cases
            "+1 1234567890",
            "+11 1234567890",
            "+111 1234567890",
            //edge cases
            "+0 0000000000"
    })
    public void userCanCheckValidPhoneNumberForCorrectness(String phone) {
        assertTrue(methodsToCheck.isValidPhoneNumber(phone));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            //negative cases:
            "+1 123456789",
            "+1234 1234567890",
            "-123 1234567890",
            "12345",
            "invalid"
    })
    public void userCanCheckInvalidPhoneNUmberForCorrectness(String phone) {
        assertFalse(methodsToCheck.isValidPhoneNumber(phone));
    }
}