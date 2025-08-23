package practice_5.task_2;

public class Main {
    public static void main(String[] args) {
        Item cup = new Item("Cup", 100, 2);
        Item microphone = new Electronics("Microphone", 10000, 3);
        Item dress = new Clothes("Dress", 5000, 5);

        Manager mike = new Manager();

        mike.manage(cup);
        mike.manage(microphone);
        mike.manage(dress);
    }
}
