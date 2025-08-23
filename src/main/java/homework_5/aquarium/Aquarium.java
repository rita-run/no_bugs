package homework_5.aquarium;

public class Aquarium {
    /*4. Аквариум
Условие:
В аквариуме может находиться одно морское существо.
В зависимости от существа, оно ведёт себя по-разному.
Примеры:
Акула плавает быстро и агрессивно
Морская звезда медленно ползает
Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.

aad shark
showBehaviour

entities:
sea animal:
features: behavior
actions: --


shark
starfish
*/

    SeaAnimal seaAnimal;

    void addAnimal(SeaAnimal seaAnimal) {
        this.seaAnimal = seaAnimal;
        System.out.println("Animal was added");
    }

    void removeAnimal() {
        System.out.println("Animal was removed");
        this.seaAnimal = null;
    }

    void showAnimalBehaviour() {
        System.out.println("Animal: " + seaAnimal.getName() + seaAnimal.getBehaviour());
    }


}
