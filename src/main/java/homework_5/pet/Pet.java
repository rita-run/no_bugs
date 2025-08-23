package homework_5.pet;

public abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    abstract void care();

    abstract void feed();
}
