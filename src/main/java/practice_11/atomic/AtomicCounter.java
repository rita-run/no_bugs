package practice_11.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    //count the number of operations in all the threads
    private static final AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                 count.incrementAndGet();
            }
        });

        Thread t2 =new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                 count.incrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Number of operations: " + count);

    }
}


