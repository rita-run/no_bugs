package practice_5.task_2;

import javax.swing.table.DefaultTableCellRenderer;

public class Electronics extends Item {
    private final static int DEFAULT_GUARANTEE = 2;
    private int quarantee;

    public Electronics(String name, double price, int count) {
        super(name, price, count);
        this.quarantee = DEFAULT_GUARANTEE;
    }

    public int getQuarantee() {
        return quarantee;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Guarantee: " + this.quarantee);
    }
}
