package homework_8.hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.random.RandomGenerator;

public class NamePrinter {
    //Задача 3:
    //Реализуйте метод, который печатает из
    // HashMap всех пользователей младше 18 лет.

    private HashMap<String, Integer> usersList;

    public NamePrinter() {
        this.usersList = new HashMap<>();
    }

    public void addUser(String name, Integer age) {
        usersList.put(name, age);
    }

    public void printUsersYoungerThan18() {
        System.out.println("Underaged users are: ");
        for (Map.Entry<String,Integer> user : usersList.entrySet()) {
            String name = user.getKey();
            Integer age = user.getValue();
            if (age < 18) {
                System.out.println(name + " " + age);
            }
        }




    }
}
