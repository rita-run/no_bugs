package homework_3;

public class LibraryTest {
    static public void main(String[] args) {
        Library book = new Library("Lolita","Nabokov", 1950, "Fiction" );
        book.author = "new";
        book.year = 1960;
        book.category = "Science fiction";
        System.out.println(book.author + " " +  book.year + " " + book.category);
    }

}
