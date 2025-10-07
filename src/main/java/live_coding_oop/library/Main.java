package live_coding_oop.library;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        entities:
        book (author)
        mag (number)
        newspaper (date)
        library (list of docs)
        manager (add doc, print info)

        common fields:
        name
         */
        Manager manager = new Manager();
        Book hp = new Book("Harry Potter", "Rowling");
        Magazine vouge = new Magazine(" Vouge", 1);
        Newspaper times = new Newspaper("Times", new Date());

        manager.addDoc(hp);
        manager.addDoc(vouge);
        manager.addDoc(times);

        System.out.println(manager.printInfo(hp));
        System.out.println(manager.printInfo(times));
    }
}