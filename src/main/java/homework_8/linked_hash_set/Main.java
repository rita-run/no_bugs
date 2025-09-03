package homework_8.linked_hash_set;

public class Main {
    public static void main(String[] args) {
        //Задача 2:
        //Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

        DuplicatesRemover duplicatesRemover = new DuplicatesRemover();

        duplicatesRemover.addOnlyUniqueItems("banana");
        duplicatesRemover.addOnlyUniqueItems("cherry");
        duplicatesRemover.addOnlyUniqueItems("apple");
        duplicatesRemover.addOnlyUniqueItems("banana");
        duplicatesRemover.addOnlyUniqueItems("pear");
    }
}
