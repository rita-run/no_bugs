package homework_9.generics.additional_tasks.general_class;

public class Storage <T> {
    private T element;

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
