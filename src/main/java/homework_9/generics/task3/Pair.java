package homework_9.generics.task3;

public class Pair <T,U> {
    //3. Задача на дженерик с двумя типами данных
    //Условие задачи: Создайте класс Pair,
    // который может хранить два объекта разных типов.
    // Класс должен позволять получать и устанавливать каждый из этих объектов.

    private T objectT;
    private U objectU;

    public void setObjectT(T objectT) {
        this.objectT = objectT;
    }

    public T getObjectT() {
        return objectT;
    }

    public U getObjectU() {
        return objectU;
    }

    public void setObjectU(U objectU) {
        this.objectU = objectU;
    }
}
