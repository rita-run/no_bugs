package homework_8.tree_set;

import java.util.TreeSet;

public class BiggestAndSmallestNumberSearcher {
    //Задача 3:
    //Найдите ближайшее большее и меньшее число к заданному в TreeSet.

    private TreeSet<Double> numbersTreeSet;

    public BiggestAndSmallestNumberSearcher() {
        this.numbersTreeSet = new TreeSet<>();
    }

    public void addNumber (Double number) {
        numbersTreeSet.add(number);
    }

    public void searchForNearestBiggestAndSmallestNumbers(Double number) {
        System.out.println("Your number is: " + number + ", \nThe nearest bigger number is: "
                + numbersTreeSet.higher(number)
                + ", \nThe nearest smaller number is: " + numbersTreeSet.lower(number));

    }
}
