package homework_5.farm;

public class Farm {
    /* 5. Ферма
Условие:
На ферме содержится одно домашнее животное.
У каждого животного свои функции и нужды.
Примеры:
Корова даёт молоко, нуждается в выпасе
Курица несёт яйца, требует зерно
Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.

    // "give food to the cow.
    herd a cow
    grains for chimken

    Entities: farm animal, cow, chimken, farm

    Features:
    farm animal


    Actions:
    farm animal: getCare
    cow: getCare - to be herd
    chimken: getCare - to get grains

     */
    private FarmAnimal farmAnimal;

    public void addAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("New animal is added");

    }

    public void removeAnimal() {
        System.out.println("Animal is removed");
        this.farmAnimal = null;
    }

    public void provideCareToAnimal() {
        System.out.println("Name: " + farmAnimal.getName() + " " + farmAnimal.getCareFromFarmWorker());
    }

    public void makeAnimalWork() {
        System.out.println("Name: " + farmAnimal.getName() + " " + farmAnimal.work());
    }


}
