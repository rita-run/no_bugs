package practice_2;

public class Student {
    //fields
    int age;
    String name;

    //constructor
    Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
    }

    //getter for age field
    int getAge() {
        return this.age;
    }

    //getter for name field
    String getName() {
        return this.name;
    }

    //setter for age field
    void setAge(int newAge) {
        this.age = newAge;
    }

    //setter for the name field
    void setName(String newName) {
        this.name = newName;
    }

    void print() {
        System.out.println("Age " + this.age + ", " + "Name " + this.name);
    }


}
