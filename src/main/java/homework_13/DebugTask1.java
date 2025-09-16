package homework_13;

public class DebugTask1 {
    //Ваша задача – запустить код, отследить выполнение, найти проблему и исправить её.
    // Задача 1:
    //Код должен напечатать все элементы массива,
    //но вместо этого выбрасывает исключение.

    public static void main(String[] args) {
        //we create an array of elements of type int, and we initialize it with values
        int[] numbers = {10, 20, 30, 40, 50};

        //next we start the for cycle and the cycle will run while the following condition is true:
        //the value of the counter should start from 0 till it is less or equals the length of the array <=5
        for (int i = 0; i < numbers.length; i++) {
            //for each iteration we print each element of the array of index i
            System.out.println(numbers[i]);
            //1st iteration: i = 0, condition = true, print numbers[0] -> i = 1
            //last iteration: i = 5, condition = true, print numbers[5] -> i = 6 ---> here the exception occurred
        }
    }
}