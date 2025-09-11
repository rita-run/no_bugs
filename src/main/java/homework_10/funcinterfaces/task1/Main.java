package homework_10.funcinterfaces.task1;

public class Main {
    public static void main(String[] args) {
        //1. Создайте свой функциональный интерфейс
        //Задача: Напишите интерфейс MathOperation,
        // который принимает два числа и возвращает результат операции.
        // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.

        MathOperations add = (int x, int y) -> x + y;
        MathOperations subtract = (x, y) -> x - y;
        MathOperations divide = (x, y) -> x / y;
        MathOperations multiply = (x, y) -> x * y;

        System.out.println(add.apply(4,2));
        System.out.println(subtract.apply(4,2));
        System.out.println(divide.apply(4,2));
        System.out.println(multiply.apply(4,2));
    }
}
