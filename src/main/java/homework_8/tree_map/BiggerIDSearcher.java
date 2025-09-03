package homework_8.tree_map;

import java.util.TreeMap;

public class BiggerIDSearcher {
    //Задача 3:
    //Реализуйте TreeMap, который хранит сотрудников и их ID,
    // с возможностью поиска ближайшего большего ID.
    /*
    3. TreeMap Задача 3:
Используй TreeMap<Integer, String>, где ключ — ID, значение — имя сотрудника
Для поиска ближайшего большего ID используй метод higherKey(id)
Если higherKey(id) вернёт null, значит более высокого ID нет
Пример: если есть ID 100, 200, 300 и задано 150, то higherKey(150) вернёт 200
     */

    private TreeMap<Integer, String> employees;

    public BiggerIDSearcher() {
        this.employees = new TreeMap<>();
    }

    public void addEmployee(Integer id, String name) {
        employees.put(id, name);
    }

    public void searchBiggerID(Integer id) {
        Integer biggerId = employees.higherKey(id);
        if (biggerId == null) {
            System.out.println("No bigger key!");
        } System.out.println("The nearest bigger ID is: " + employees.higherKey(id));
    }
}
