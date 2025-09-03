package homework_8.tree_set;

public class Main {
    public static void main(String[] args) {
        //Задача 3:
        //Найдите ближайшее большее и меньшее число к заданному в TreeSet.
        BiggestAndSmallestNumberSearcher searcher = new BiggestAndSmallestNumberSearcher();

        searcher.addNumber(1.0);
        searcher.addNumber(555.0);
        searcher.addNumber(50.5);
        searcher.addNumber(50.1);

        searcher.searchForNearestBiggestAndSmallestNumbers(50.2);
    }
}
