package homework_8.array_list;

import java.util.ArrayList;

public class LongestStringFinder {
    //Задача 3:
    //        Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
    private ArrayList<String> stringArrayList;

    public LongestStringFinder() {
        this.stringArrayList = new ArrayList<>();
    }

    public void addStringToTheArray(String string) {
        stringArrayList.add(string);
    }

    public String getLongestStringFromArray() {
        //I declare a variable longestString and assign it the first element of the list.
        //I assume this first element is the longest for now.
        String longestString = stringArrayList.get(0);

        //I'll use a loop to iterate over elements in a collection

        //I declare an iteration variable i and initialize it with the value 1
        // because I want to start iterating from the second element of the array,
        // since the first element is already used as the initial longest string.

        //I will repeat the loop until i reaches the size of the list.

        //I increment the iteration variable i by 1 on each loop iteration
        // to move to the next index in the array.
        for (int i = 1; i < stringArrayList.size(); i++) {
            //I create a conditional construct with a condition
            if (longestString.length() < stringArrayList.get(i).length()) {
                longestString = stringArrayList.get(i);
            }
        }

        return longestString;
    }
}

