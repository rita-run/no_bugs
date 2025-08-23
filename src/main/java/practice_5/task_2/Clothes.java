package practice_5.task_2;

public class Clothes extends Item {
    private final static char DEFAULT_SIZE = 'M';
    private int size;

    public Clothes(String name, double price, int count) {
        super(name, price, count);
        this.size = DEFAULT_SIZE;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Size: " + size);
    }
}
