package homework_5.pet;

public class Main {



    public static void main(String[] args) {
        Pet pluto = new Dog("Pluto");
        Pet meredith = new Cat("Meridith");

        pluto.care();
        pluto.feed();
        meredith.care();
        meredith.feed();
    }
}
