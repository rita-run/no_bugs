package homework_13;

public class DebugTask2 {
    //Задача 2:
    //Код должен вычислить сумму чисел от 1 до 5, но почему-то результат неправильный.

    //let's think about what we expect the code to do. Example:
    //1 + 2 + 3 + 4 + 5 = 15
    //1 + 2 = 3

    public static void main(String[] args) {
        int sum = calculateSum(5);
        //the actual result:
        //1st iteration:
        // i = 1, true
        //0 + 1 = 1;

        //2nd iteration:
        //i = 0, true
        //1 + 0 = 1

        //3d iteration:
        //i = 0 - 1 = -1, true
        //1+-1 = 0
        System.out.println("Sum: " + sum);
    }
    public static int calculateSum(int n) {
        int sum = 0;
        //we use a loop to repeat the bloc of code
        //we will repeat it till the condition is true
        //the condition is following: from 1 to n and decrease i each iteration to 1 (1 -> 0 -> -1 etc)
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}