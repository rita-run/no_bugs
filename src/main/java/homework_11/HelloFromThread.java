package homework_11;

public class HelloFromThread {
    public static void main(String[] args) throws InterruptedException {
        //1. Задача: создание одного потока
        //Условие задачи: Напишите программу,
        //в которой создается отдельный поток,
        //выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from the thread!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
    }
}
