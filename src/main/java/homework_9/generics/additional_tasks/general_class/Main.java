package homework_9.generics.additional_tasks.general_class;

public class Main {
    public static void main(String[] args) {
        //Обобщённый класс
        //Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.
        Storage<String> stringStorage = new Storage<>();

        stringStorage.setElement("String");
        System.out.println(stringStorage.getElement());

        Storage<Integer> integerStorage = new Storage<>();

        integerStorage.setElement(22);
        System.out.println(integerStorage.getElement());
    }
    }

