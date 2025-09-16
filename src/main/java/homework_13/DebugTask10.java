package homework_13;

import java.util.*;

public class DebugTask10 {
//  Задача 10:
//  Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.

// Cause:
// Modifying a Collection while iterating over it: This is the most common scenario.
// If you are iterating over a Collection (e.g., ArrayList, HashSet) using an Iterator or an enhanced for loop,
// and you attempt to add, remove, or modify elements in that same Collection directly (e.g., using list.remove()),
// the Iterator will detect this modification and throw a ConcurrentModificationException.
// This is because many Collection implementations in Java are "fail-fast,"
// meaning their iterators are designed to quickly detect and report structural changes to the underlying collection.

//Solutions:
//Use the Iterator's remove() method:
// When you need to remove elements during iteration,
// use the remove() method provided by the Iterator itself,
// rather than the Collection's remove() method.
// This is the correct way to modify the collection during iteration.

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}