package practice_9.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Lolita", "Nabokov"));
        library.addBook(new Book("War and Peace", "Tolstoy"));
        library.addBook(new Book("Crime and Punishment", "Dostoevsky"));
        library.addBook(new Book("Evgeny Onegin", "Pushkin"));
        //library.addBook(new Book("Evgeny Onegin", "Pushkin"));
    }
}
