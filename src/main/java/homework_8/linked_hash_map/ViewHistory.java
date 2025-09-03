package homework_8.linked_hash_map;

import java.security.SecureRandom;
import java.util.LinkedHashMap;

public class ViewHistory {
    //Задача 3:
    //Создайте LinkedHashMap, который хранит
    // историю просмотров пользователя (максимум 10 элементов).

    LinkedHashMap<String,String> viewHistory;

    public ViewHistory() {
        this.viewHistory = new LinkedHashMap<>();
    }

    public void addEntry(String pageID, String pageName) {
        if (viewHistory.size() > 9) { //if the size of the view history list is more than 9 (10 and more)
            String firstKey = viewHistory.keySet().iterator().next(); //delete the 1st entry
            viewHistory.remove(firstKey); //
        } viewHistory.put(pageID, pageName);// else just put one
    }

    public void printViewHistoryList() {

        System.out.println(viewHistory);
    }




}
