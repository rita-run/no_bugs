package homework_5.farm;

import homework_5.zoo.Animal;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        FarmAnimal cow = new Cow("Milka");
        FarmAnimal chimken = new Chimken("Coco");

        farm.addAnimal(cow);
        farm.provideCareToAnimal();
        farm.makeAnimalWork();
        farm.removeAnimal();

        farm.addAnimal(chimken);
        farm.provideCareToAnimal();
        farm.makeAnimalWork();
        farm.removeAnimal();
    }

}
