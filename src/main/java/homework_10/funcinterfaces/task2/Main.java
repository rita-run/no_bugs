package homework_10.funcinterfaces.task2;

public class Main {
    public static void main(String[] args) {
        //2. Использование анонимного класса
        //Задача: Создайте анонимный класс,
        // реализующий интерфейс Runnable,
        // который выводит сообщение "Hello from anonymous class!".

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        runnable.run();
    }
}
