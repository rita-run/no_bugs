package practice_13;

import java.util.ArrayList;
import java.util.List;

public class StringListHander {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] inputs = {"apple", "banana", "apple", "Orange", "Banana", "Grape", "Orange"};

        for (String input : inputs) {
            if (input.equals("Orange")) {
                int j = 0;
            }
            if (!list.contains(input.toLowerCase())) {
                list.add(input.toLowerCase());
            }
        }

        System.out.println("Size of the list: " + list.size());
        System.out.println("The list consists of: " + list);

    }
}