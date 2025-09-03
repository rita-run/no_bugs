package homework_8.hash_map;

public class Main {
    public static void main(String[] args) {
        /*NameChecker checker = new NameChecker();

        checker.addStudent("Harry", 12);
        checker.addStudent("Ron", 12);
        checker.addStudent("Hermione", 12);
        checker.addStudent("Draco", 12);

        checker.searchName("Luna Lovegood");
        checker.searchName("Draco");

         */
        NamePrinter printer = new NamePrinter();

        printer.addUser("Harry", 18);
        printer.addUser("Ron", 17);
        printer.addUser("Hermione", 19);

        printer.printUsersYoungerThan18();

    }

}
