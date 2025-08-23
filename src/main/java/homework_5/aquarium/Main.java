package homework_5.aquarium;

public class Main {
    public static void main(String[] args) {
        //Name: shark, behavior: swims fast

        Aquarium aquarium = new Aquarium();

        SeaAnimal shark = new Shark("Baby shark");

        aquarium.addAnimal(shark);
        aquarium.showAnimalBehaviour();
        aquarium.removeAnimal();

        SeaAnimal starfish = new Starfish("Patrik");

        aquarium.addAnimal(starfish);
        aquarium.showAnimalBehaviour();
        aquarium.removeAnimal();
    }
}
