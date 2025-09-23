package homework_12;

import org.junit.jupiter.api.BeforeEach;

public class MethodsToCheckTest {
    /* first, we create a variable of type MethodsToCheck
    protected - is an access modifier.
    it means that the variable methodsToCheck
    will be accessible:
    - within th same class (MethodsToCheckTest)
    - within the same package (test.java.homework_12)
    - by subclasses (even in different packages)
     */
    protected MethodsToCheck methodsToCheck;

    @BeforeEach
    public void setupTest() {
        methodsToCheck = new MethodsToCheck();
    }
}