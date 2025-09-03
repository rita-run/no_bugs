package homework_8.tree_map;

public class Main {
    public static void main(String[] args) {
        //Задача 3:
        //Реализуйте TreeMap, который хранит сотрудников и их ID,
        // с возможностью поиска ближайшего большего ID.

        BiggerIDSearcher searcher = new BiggerIDSearcher();

        searcher.addEmployee(1, "Harry");
        searcher.addEmployee(2, "Ron");
        searcher.addEmployee(3, "Hermione");
        searcher.addEmployee(4, "Draco");

        searcher.searchBiggerID(3);
        searcher.searchBiggerID(4);
    }
}
