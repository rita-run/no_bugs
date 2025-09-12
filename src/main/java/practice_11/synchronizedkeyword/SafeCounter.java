package practice_11.synchronizedkeyword;

public class SafeCounter {
    //method for increasing and decreasing value
    //task: implement in multithread environment
    private int count = 0;

    public synchronized void increment() {
        this.count++;
    }

    public synchronized void decrement() {
        this.count--;
    }

    public synchronized int getCount() {
        return count;
    }
}
