package homework_9.task2;

//unchecked: Runtime exception
public class CantDivideByZeroException extends RuntimeException {
    public CantDivideByZeroException(String message) {
        super(message);
    }
}
