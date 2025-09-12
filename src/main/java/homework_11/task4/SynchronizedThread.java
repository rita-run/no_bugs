package homework_11.task4;

public class SynchronizedThread {
    public static void main(String[] args) throws InterruptedException {
        //4. Задача: использование synchronized
        //Условие задачи: Напишите класс Counter с методом increment,
        //увеличивающим значение счётчика.
        //Создайте два потока, каждый из которых вызывает increment() 1000 раз.
        //Обеспечьте правильную работу с помощью synchronized.
        //synchronized - keyword that orders method to use only one thread at the time
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                System.out.println("Thread 1: The counter is increased!");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                System.out.println("Thread 2: The counter is increased!");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The value of counter: " + counter.getCounter());
    }
}
