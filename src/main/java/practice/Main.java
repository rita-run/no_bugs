package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Alice", 17);
        students.put("Bob", 20);
        students.put("Charlie", 15);

        System.out.println("Underage students are: ");
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            String name = student.getKey();
            Integer age = student.getValue();
            if (age < 18) {
                System.out.println(name + " " + age);
            }
        }


    }

}
