package homework_5.pet;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }


    @Override
    void care() {
        System.out.println(name + " plays with a cat toy");
    }

    @Override
    void feed() {
        System.out.println(name + " eats cat food");
    }
}
