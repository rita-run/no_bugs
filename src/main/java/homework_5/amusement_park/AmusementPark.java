package homework_5.amusement_park;

public class AmusementPark {
    /*
    7. Парк развлечений
Условие:
В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
Примеры:
Американские горки — проверка безопасности
Карусель — техническое обслуживание
Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.

1. Entities
1) Attraction
2) Russian rides
3) Merry-go-round
4) Amusement Park

2. Features
Name

3. Actions
1) Attraction - can getCare
2) Russian rides - can getCare: check security
3) Merry-go-round - can getCare: provide tech support
4) Amusement Park - can:
 - manage the Attraction and
 - print the info about the Attraction

 4. OOP
 1) Encapsulation (hide the names and provide the getters)
 2) Inheritance
 3) Abstraction
 4) Polymorphism
     */

    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Attraction is added");
    }

    public void provideCare() {
        System.out.println("Information for workers: Name: " + this.attraction.getName() + ", " + this.attraction.getCare());
    }

    public void printInfo() {
        System.out.println("Information for visitors: Name: " + this.attraction.getName() + ", " + this.attraction.getDescription());
    }

    public void removeAttraction() {
        this.attraction = null;
    }
}
