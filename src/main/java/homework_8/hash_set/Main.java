package homework_8.hash_set;

public class Main {
    public static void main(String[] args) {
        //Задача 4:
        //Создайте HashSet, содержащий набор имен.
        // Напишите программу, которая проверяет,
        // содержится ли ваше имя в множестве,
        // и выводит соответствующее сообщение.

        /*NameChecker nameChecker = new NameChecker();

        nameChecker.addName("Draco");
        nameChecker.addName("Harry");
        nameChecker.addName("Ron");
        nameChecker.addName("Hermione");

        nameChecker.checkName("Ron");
        nameChecker.checkName("Snape");

        /*
        Задача 3:
        Реализуйте метод, который принимает
        List<String> и возвращает Set<String> без дубликатов.
         */

        UniqueStringChecker checker = new UniqueStringChecker();

        checker.addElementToList("banana");
        checker.addElementToList("banana");
        checker.addElementToList("berry");
        checker.addElementToList("potato");

        checker.removeDupes();


    }
}
