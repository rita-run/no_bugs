package live_coding_oop.stidentsgroup;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
}