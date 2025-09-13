package homework_12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParityTest extends MethodsToCheckTest {
    /* 1. Проверка чётности числа
Напишите тесты для метода, который определяет, является ли число чётным:

public boolean isEven(int number) {
    return number % 2 == 0;
}

Тесты должны проверять:
Чётные и нечётные числа: 4, 1
Нулевое значение: 0
Отрицательные числа: -4, -1

Positive cases (valid inputs):
Even (=true):
- "4" - true
- "-4" - true
- 0

Not even(=false):
1 - false
-1 - false

Negative cases (invalid inputs):
- we do not manage such cases here
     */

    @ParameterizedTest
    @ValueSource(ints = {
            //positive cases:
            4, -4, 0
    })
    public void userCanCheckIfEvenNumberIsEven(int initialNumber) {
        //first, we create an object -
        //an instance of the class methods of what we need to test
        //- to be able to call those methods
        //it is handled by calling setupTest() method of the MethodsToCheckTest Class
        //that is the parent of the current class
        //that is called before each test

        //next, we need to declare and initialize a variable
        //to store the number we need to test the method with
        //(we do it using JUnit's @ParametrizedTest of the test
        // + @ValueSource interface - and pass the variable
        // as an argument of the test method)

        //then, we address the object and call the isEven method
        //and pass the variable as an argument
        //the method returns a boolean value
        boolean actualResult = methodsToCheck.isEven(initialNumber);

        //next we check if the returned value is true using
        //a JUnit method "assertTrue" to make sure that the return value is true
        //(as we expect it to be)
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            //negative cases:
            1, -1
    })
    public void userCanCheckIfOddNumberIsNotEven(int initialNumber) {
        boolean actualResult = methodsToCheck.isEven(initialNumber);

        assertFalse(actualResult);
    }
}