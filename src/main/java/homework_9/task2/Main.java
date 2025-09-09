package homework_9.task2;

public class Main {
    public static void main(String[] args) {
        //2. Обработка непроверяемого исключения
        //Условие задачи: Напишите метод, который принимает
        // на вход два числа и выполняет их деление. Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
        //2 5 -> 2/5= 2.5
        //2 0 -> exception

        Divider divider = new Divider();

        divider.setNumbers(3, 2);
        divider.divideNumbers();

        divider.setNumbers(2,0);
        divider.divideNumbers();
    }
}
