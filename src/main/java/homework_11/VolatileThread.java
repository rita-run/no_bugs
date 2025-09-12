package homework_11;

public class VolatileThread {
    static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        //3. Задача: использование volatile
        //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
        //В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.

        Thread t1 = new Thread(() -> {
            int counter = 0;
            while (!stop == true) {
                System.out.println("We are increasing the counter: " + counter++);
            }
        });

        t1.start();
        System.out.println("The thread is started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stop = true;
        System.out.println("The thread is stopped");
    }
}
