package homework_11.task4;

public class Counter {
    private int counter;

    //if we delete the synchronized keyword the result
    //of getCounter can be different from 2000
    public synchronized void increment() {
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
}
