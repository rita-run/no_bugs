package homework_9.generics.additional_tasks.work_with_nums;

public class Main {
    public static void main(String[] args) {
        //Работа с числами
        //Задача: Создайте класс NumberBox<T extends Number>,
        // который хранит только числа и возвращает их сумму.
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.addNumber(1);
        integerNumberBox.addNumber(2);
        integerNumberBox.addNumber(3);
        integerNumberBox.addNumber(4);
        System.out.println(integerNumberBox.returnSum());

        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.addNumber(5.01);
        doubleNumberBox.addNumber(55.002);
        doubleNumberBox.addNumber(555.0003);
        System.out.println(doubleNumberBox.returnSum());
    }
}
