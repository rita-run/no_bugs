package homework_5.botanical_garden;

public class BotanicalGarden {
    /*6. Ботанический сад
    Условие:
    В ботаническом саду содержится одно растение.
    У разных растений — разные требования к уходу.
    Примеры:
    Орхидея — высокая влажность и тень
    Кактус — много света, редкий полив
    Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.

    1. Entities:
    1) Plant
    2) Orchid
    3) Cactus
    4) The Garden

    2. Features

    3. Actions
    1) Plant can getCareFromGarden
    2) Orchid can getCareFromGarden: needs high humidity and shadow
    3) Cactus can getCareFromGarden: needs sunlight and needs to be watered rarely
    4) Garden can provideCare for ANY PLANT

    4. Connections and Relations

    5. OOP
    1) Inheritance
    2) Encapsulation (want hide the details from the Garden -
    it just provides care, but do not have to know the details)
    3) Polymorphism (the method getCare will be implemented differently in the children classes
    4) Abstraction
     */

    Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Plant is added");
    }

    public void provideCare() {
        System.out.println("Name: " + this.plant.getName() + ", " + this.plant.getCareFromGarden());
    }

    public void removePlant() {
        this.plant = null;
    }
}
