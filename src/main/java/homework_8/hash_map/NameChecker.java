package homework_8.hash_map;

import java.util.HashMap;

public class NameChecker {
    //Задача 2:
    //Проверьте, есть ли определённое имя в HashMap.

    private HashMap<String, Integer> studentsList;

    public NameChecker() {
        this.studentsList = new HashMap<>();
    }

    public void addStudent(String name, Integer age) {
        studentsList.put(name,age);
    }

    public void searchName(String name) {
        if (studentsList.containsKey(name)) {
            System.out.println("This name is on the list");
        } else System.out.println("This name is NOT on the list");
    }
}
