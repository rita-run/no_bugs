package homework_9.generics.task3;

public class Main {
    public static void main(String[] args) {
        //3. Задача на дженерик с двумя типами данных
        //Условие задачи: Создайте класс Pair,
        // который может хранить два объекта разных типов.
        // Класс должен позволять получать и устанавливать каждый из этих объектов.

        Pair<ObjectT, ObjectU> pair = new Pair<>();


        pair.setObjectT(new ObjectT("This is object of type T"));
        pair.setObjectU(new ObjectU("This is object of type U"));

        System.out.println(pair.getObjectT().getName());
        System.out.println(pair.getObjectU().getName());
    }
}
