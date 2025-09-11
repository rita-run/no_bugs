package practice_10.funcinterfaces;

@FunctionalInterface
public interface Checker {
    //The interface checks is the number meet the condition
    //Default method prints the number if it passes the check

    boolean check(int number);

    default void printIfValid(int number) {
        if (check(number)) {
            System.out.println(number);
        }
    }
}
