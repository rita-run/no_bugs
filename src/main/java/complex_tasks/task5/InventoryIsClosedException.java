package complex_tasks.task5;

public class InventoryIsClosedException extends RuntimeException {
    public InventoryIsClosedException(String message) {
        super(message);
    }
}
