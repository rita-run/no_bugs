package homework_11;

public class TwoThreads {
    public static void main(String[] args) throws InterruptedException {
        //2. Задача: создание двух потоков
        //Условие задачи: Создайте два потока.
        //Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
