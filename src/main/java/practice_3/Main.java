package practice_3;

public class Main {
    public static void main(String[] args) {
        //we created a variable
        //we assigned to the petya variable a class Student's instance;
        //by calling the default constructor of the Student class
        System.out.println(Student.studentCount);

        Student petya = new Student(18, "Petya");

        System.out.println(Student.studentCount);

        Student kolya = new Student(20, "Kolya");

        System.out.println(Student.studentCount);



    }
}
