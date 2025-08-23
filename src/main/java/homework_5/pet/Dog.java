package homework_5.pet;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    void care() {
        //Pluto walks in the park
        System.out.println(name + " walks in the park");
    }

    @Override
    void feed() {
        //Pluto eats dog food
        System.out.println(name + " eats dog food");
    }
}
