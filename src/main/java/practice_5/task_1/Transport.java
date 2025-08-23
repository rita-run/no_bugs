package practice_5.task_1;

public abstract class Transport {
    private double speed; //км/ч
    private int capacity; //м в 3

    public Transport(int capacity, double speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    abstract void start();
}

