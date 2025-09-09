package practice_9.generics;

public class Box<T extends Book> {
    private T element;

    public void setElement(T element) {
        this.element = element;
    }

    private T getElement() {
        return this.element;
    }


}
