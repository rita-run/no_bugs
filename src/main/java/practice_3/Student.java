package practice_3;

public class Student {
    final static int MAX_YEARS = 11;
    static int studentCount;

    static {
        studentCount = 0;
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
        studentCount++; //increment
    }


    int age;
    String name;

    static void printMaxYears() {
        System.out.println(MAX_YEARS);
    }

}
