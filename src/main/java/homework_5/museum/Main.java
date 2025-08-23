package homework_5.museum;

public class Main {
    public static void main(String[] args) {
        /*
        8. Музей
Условие:
В музее выставлен экспонат.
У каждого экспоната своя история и условия хранения.
Примеры:
Манускрипт — требует контролируемой влажности
Скульптура — нуждается в реставрации
Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.

1. Entities
1) Showpiece
2) Manuscript
3) Sculpture
4) Museum

2. Features
1) Showpiece - name, description
2) Manuscript - name, description: year, country of origin
3) Sculpture - name, description: year, author
4) Museum

3. Actions
1) Showpiece - getDescription, getCare
2) Manuscript - getDescription, getCare: to be kept with controlled humidity
3) Sculpture - getDescription, getCare: get restoration
4) Museum:
- can provide care
- print info (description)

4. OOP
1) Inheritance
2) Encapsulation
3) Abstraction
4) Polymorphism
         */
        Museum museum = new Museum();

        Showpiece manuscript = new Manuscript("Ancient manuscript");
        Showpiece sculpture = new Sculpture("Greek sculpture");

        museum.addShowpiece(manuscript);
        museum.provideCare();
        museum.printInfo();

        museum.addShowpiece(sculpture);
        museum.provideCare();
        museum.printInfo();
    }
}
