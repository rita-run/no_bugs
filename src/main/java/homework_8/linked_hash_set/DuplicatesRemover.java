package homework_8.linked_hash_set;

import java.util.LinkedHashSet;

public class DuplicatesRemover {
//    Задача 2:
//    Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

    private LinkedHashSet<String> uniqueItemsList;

    public DuplicatesRemover() {
        this.uniqueItemsList = new LinkedHashSet<>();
    }

    public void addOnlyUniqueItems(String e) {
        if (uniqueItemsList.contains(e)) {
            System.out.println("Such an element is already exists!");
        } else {
            uniqueItemsList.add(e);
        }
        System.out.println(uniqueItemsList);
    }

}
