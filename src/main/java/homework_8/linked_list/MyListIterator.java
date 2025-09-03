package homework_8.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyListIterator {
    //Задача 5:
    //Используйте ListIterator для прохода по LinkedList в обоих направлениях.

    /*
    1) read what is iterator
    2) read what methods it has?
    3) what instrument we can use to print all the elements of collection?
     */

    private LinkedList<Integer> myList;

    public MyListIterator() {
        this.myList = new LinkedList<>();
    }

    public void addElement(Integer e) {
        myList.add(e);
    }

    //the method will iterate the myList and print all the entities from the list
    // 1 2 45 88 101 3 6
    //
    public void iterateMyList() {
        ListIterator<Integer> iterator = myList.listIterator();
        //while the linked list has next item

        System.out.println("Let's go forward!");
        while (iterator.hasNext()) {
            //print the items one by one
            System.out.println(iterator.next());
        }
        //while the linked list has previous item
        System.out.println("\nLet's go backwards!");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }


}
