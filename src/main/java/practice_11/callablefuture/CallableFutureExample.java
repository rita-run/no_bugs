package practice_11.callablefuture;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureExample {
    //complex calculations of DNA
    //we need to wait the end of calculation and get the result

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> dnaResult = () -> {
            System.out.println("Complex calculation of DNA");
            Thread.sleep(10000);
            int randomDnaResult = new Random().nextInt();
            return randomDnaResult;
        };

        Future<Integer> future = executorService.submit(dnaResult);

        System.out.println("DNA result: " + future.get());

        executorService.shutdown();


    }
}
