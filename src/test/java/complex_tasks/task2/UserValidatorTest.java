package complex_tasks.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {
    private UserValidator validator;
    private User snape;

    @BeforeEach
    public void setupTest() {
        validator = new UserValidator();
        validator.setValidationEnabled(true);
        snape = new User("Severus Snape", 40, "severus@hogwarts.com");
    }

    @Test
    public void validatorCanCheckValidName() {
        assertTrue(validator.checkName(snape));
    }

    @Test
    public void validatorCanCheckValidAge() {
        assertTrue(validator.checkAge(snape));
    }

    @Test
    public void validatorCanCheckValidEmail() {
        assertTrue(validator.checkEmail(snape));
    }
}