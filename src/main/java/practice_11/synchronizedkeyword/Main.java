package practice_11.synchronizedkeyword;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter safeCounter = new SafeCounter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                safeCounter.decrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The value of count: " + safeCounter.getCount());

    }
}
