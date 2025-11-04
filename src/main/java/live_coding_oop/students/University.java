package live_coding_oop.students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private Map<String, List<String>> houses;

    public University() {
        this.houses = new HashMap<>();
    }

    public void addStudent(Student student) {
        houses.computeIfAbsent(student.getGroup(), k -> new ArrayList<>()).add(student.getName());
    }

    public void addStudents(List<Student> students) {
        for (Student student : students) {
            houses.computeIfAbsent(student.getGroup(), k -> new ArrayList<>()).add(student.getName());
        }
    }

    public void printStudents() {
        System.out.println(houses);
    }
}