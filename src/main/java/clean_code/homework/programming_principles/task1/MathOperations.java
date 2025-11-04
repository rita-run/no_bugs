package clean_code.homework.programming_principles.task1;

public class MathOperations {
    /*
    Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.
     */
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int add(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(new int[] {1, 2, 3}));
        System.out.println(add(1,2));
        System.out.println(add(1,2, 3));
        System.out.println(add(1,1, 1, 1));
    }
}