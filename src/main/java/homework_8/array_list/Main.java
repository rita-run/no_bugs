package homework_8.array_list;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1:
        Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.


        ArrayList<Integer> simpleArrayList = new ArrayList<>(5);
        simpleArrayList.add(3);
        simpleArrayList.add(5);
        simpleArrayList.add(6);
        simpleArrayList.add(12);
        simpleArrayList.add(101);
        simpleArrayList.add(555);
        System.out.println(simpleArrayList);
        */

        LongestStringFinder longestStringFinder = new LongestStringFinder();
        longestStringFinder.addStringToTheArray("Short string");
        longestStringFinder.addStringToTheArray("Middle string. Middle string");
        longestStringFinder.addStringToTheArray("Long string. Long string. Long string");

        System.out.println(longestStringFinder.getLongestStringFromArray());

    }
}
