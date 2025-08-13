package homework_3;

public class Main {
    static public void main(String[] args) {
        Employee mike = new Employee(1, "Mike");
        Employee alice = new Employee(2, "Alice");
        Employee.companyName = "My company";
        mike.printCompanyName();
        alice.printCompanyName();

        System.out.println(MathConstants.calculateCircleArea(10));
        System.out.println(MathConstants.calculateCircumference(10));

        University maria = new University(1, "Maria");
        University petr = new University(2, "Petr");
        University ann = new University(3, "Ann");
        University.changeUniversityName("My Uni");
        maria.printStudentInfo();
        petr.printStudentInfo();
        ann.printStudentInfo();

        GameSettings game1 = new GameSettings("Game 1", 19);
        GameSettings game2 = new GameSettings("Game 2", 20);
        GameSettings.maxPlayers = 10;
        GameSettings.setMaxPlayers(20);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

        Person person1 = new Person("Ivan", "Ivanov", "123-45-6789");
        Person person2 = new Person("Petr", "Petrov", "123-45-6780");
        person1.setLastName("Sidorov");
        person1.printPersonInfo();
        person2.setLastName("Smith");
        person2.printPersonInfo();




    }
}
