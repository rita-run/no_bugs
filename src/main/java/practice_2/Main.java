package practice_2;

public class Main {
    public static void main(String[] args ) {
        //lets check constructor
        Student petya = new Student(18, "Petya");

        System.out.println("Petya's age: " + petya.age);
        System.out.println("Petya's name: " + petya.name);

        Student kolya = new Student(12, "Kolya");

        System.out.println("Kolya's age: " + kolya.age);
        System.out.println("Kolya's name: " + kolya.name);

        petya.setName("Vasya");
        System.out.println("Petya's name: " + petya.name);

        petya.print();
        kolya.print();

        //debugging


    }
}
