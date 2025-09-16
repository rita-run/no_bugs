package homework_13;

public class DebugTask5 {
//    Задача 5:
//    Код должен увеличить возраст человека, но почему-то возраст остаётся прежним.
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
//        person: Alice, 25

//      we call the updateAge method and pass person ("Alice, 25" as an argument
//      updateAge(person);
        person.updateAge();
        System.out.println("Updated age: " + person.getAge());
//      the output of the program will be 25, because the updateAge method doesn't do anything
    }

//  here we declare a new method that takes the Person Class' object as an argument
//    public static void updateAge(Person person) {
//      and initialize it with new value - creates a new object of Person class
//      but pass in the constructor name and age of already existed object
//      but there is no key word this. so 1st af all the value is not assigned to an object's field
//        person = new Person(person.getName(), person.getAge() + 1);
//    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void updateAge() {
        this.age += 1;
    }
}