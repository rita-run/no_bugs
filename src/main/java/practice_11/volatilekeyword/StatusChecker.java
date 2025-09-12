package practice_11.volatilekeyword;

public class StatusChecker implements Runnable {
    //if active = false, all the threads have to stop running
    private volatile boolean active = true;

    @Override
    public void run() {
        while (active) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        this.active = false;
    }
}
