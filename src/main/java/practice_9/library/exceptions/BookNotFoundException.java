package practice_9.library.exceptions;

//checked: exception (children)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
