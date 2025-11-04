package clean_code.homework.programming_principles.task7;

public class Programmer implements Worker, Eater {
    /*
    Задача: Разделите интерфейс на отдельные специализированные интерфейсы.
     */
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }
}