package live_coding_oop.students;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student harry = new Student("Harry Potter", "Gryffindor");
        Student ron = new Student("Ron Wisely", "Gryffindor");
        Student draco = new Student("Draco Malfoy", "Slytherin");
        Student cedric = new Student("Cedric Diggory", " Hufflepuff");
        Student tonks = new Student("Nymphadora Tonks", " Hufflepuff");
        Student albusSeverus = new Student("Albus Severus Potter", "Slytherin");

        University hogwarts = new University();
        hogwarts.addStudents(List.of(harry, ron, draco, cedric, tonks));
        hogwarts.printStudents();

        hogwarts.addStudent(albusSeverus);
        hogwarts.printStudents();
    }
}