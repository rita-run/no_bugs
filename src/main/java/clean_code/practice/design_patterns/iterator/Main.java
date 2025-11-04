package clean_code.practice.design_patterns.iterator;

public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("1984"));
        collection.addBook(new Book("Brave New World"));

        // We're going to traverse the Book collection using the implemented iterator
        Iterator<Book> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}