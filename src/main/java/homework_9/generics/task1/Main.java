package homework_9.generics.task1;

public class Main {
    public static void main(String[] args) {
        //1. Задача на дженерик класс
        //Условие задачи: Разработайте дженерик класс Box,
        // который может хранить объекты любого типа.
        // Класс должен иметь методы для установки и получения значения объекта,
        // хранящегося внутри.

        Box<String> stringBox = new Box<>();
        stringBox.setElement("String");
        System.out.println(stringBox.getElement());

        Box<Integer> integerBox = new Box<>();
        integerBox.setElement(0);
        System.out.println(integerBox.getElement());

        Box<Toy> toyBox = new Box<>();
        Toy teddy = new Toy("Teddy bear");
        toyBox.setElement(teddy);
        System.out.println(toyBox.getElement().getToyName());



    }
}
