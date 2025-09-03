package homework_8.hash_set;

import java.util.HashSet;

public class NameChecker {
    //Задача 4:
    //Создайте HashSet, содержащий набор имен.
    // Напишите программу, которая проверяет,
    // содержится ли ваше имя в множестве,
    // и выводит соответствующее сообщение.

    private HashSet<String> names;

    public NameChecker() {
        this.names = new HashSet<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public void checkName(String name) {
        //address the names HashSet
        if (names.contains(name)) {
            //if true
            //print "There is such name!"
            System.out.println("There is a name of " + name + " in the list");
        } else System.out.println("There is NO such name as " + name + " in the list");
    }

}
