package live_coding_oop.calculator;

public class Calculator {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!" + e.getMessage());
            return 0;
        }
    }
}
