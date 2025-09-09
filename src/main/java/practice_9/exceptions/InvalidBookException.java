package practice_9.exceptions;

//unchecked: Runtime exception
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message) {
        super(message);
    }

}
