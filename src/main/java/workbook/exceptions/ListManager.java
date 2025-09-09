package workbook.exceptions;

import java.util.ArrayList;

public class ListManager {
    //        Исключение при пустом списке
    //        Проверка на пустоту с выбросом исключения.
    private ArrayList<Integer> myList;

    public ListManager() {
        this.myList = new ArrayList<>();
    }

    public void addElement(Integer e) {
        this.myList.add(e);
    }

    public void deleteFirstElement() {
        if (this.myList.isEmpty()) {
            throw new ListIsEmptyException("List is empty!");
        } this.myList.remove(0);
    }
}



