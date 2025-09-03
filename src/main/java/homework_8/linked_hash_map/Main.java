package homework_8.linked_hash_map;

public class Main {
    public static void main(String[] args) {
        //Задача 3:
        //Создайте LinkedHashMap, который хранит
        // историю просмотров пользователя (максимум 10 элементов).

        ViewHistory viewHistory = new ViewHistory();

        viewHistory.addEntry("1", "Page");
        viewHistory.addEntry("2", "Page");
        viewHistory.addEntry("3", "Page");
        viewHistory.addEntry("4", "Page");
        viewHistory.addEntry("5", "Page");
        viewHistory.addEntry("6", "Page");
        viewHistory.addEntry("7", "Page");
        viewHistory.addEntry("8", "Page");
        viewHistory.addEntry("9", "Page");
        viewHistory.addEntry("10", "Page");

        viewHistory.printViewHistoryList();

        viewHistory.addEntry("11", "Page");

        viewHistory.printViewHistoryList();
    }
}
