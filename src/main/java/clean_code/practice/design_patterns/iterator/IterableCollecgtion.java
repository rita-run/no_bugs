package clean_code.practice.design_patterns.iterator;

public interface IterableCollecgtion<T> {
    Iterator<T> createIterator();
}