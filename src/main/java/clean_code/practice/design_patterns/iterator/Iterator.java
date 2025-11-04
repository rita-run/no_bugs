package clean_code.practice.design_patterns.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
