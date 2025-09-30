package workbook.collections;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;

public class SimpleTasks {
    private ArrayDeque<String> toDoList = new ArrayDeque<>(List.of("to do 1", "to do 2", "to do 3", "to do 4", "to do 5"));
    public void addTaskToTheToDoList(String task) {
        if (toDoList.size() >= 5) {
            toDoList.removeLast();
        }
        toDoList.addFirst(task);
    }

    public static void main(String[] args) {
//        2. Уникальные города
// При вводе городов исключай повторы. Порядок не важен.
        HashSet<String> citiesHashSet = new HashSet<>(List.of("Tokyo", "Moscow", "London", "London"));
        System.out.println(citiesHashSet);

//       3. Список последних задач
// Храни только последние 5 задач, над которыми работал пользователь. При добавлении новой старейшая удаляется.
/* Possible solutions:
        - ArrayDeque (add and delete from the both ends). We don't need the indexes, so ArrayDeque it'll be
        - LinkedList
 */
        SimpleTasks toDo = new SimpleTasks();
        System.out.println("Initial to do list: " + toDo.toDoList);

        toDo.addTaskToTheToDoList("task6");
        System.out.println("Updated to do list: " + toDo.toDoList);
    }
}