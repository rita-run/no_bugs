package homework_10.funcinterfaces.task3;

@FunctionalInterface
public interface ParityChecker<T> {
    boolean checkParity(T t);

}
