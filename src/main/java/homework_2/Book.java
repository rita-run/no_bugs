package homework_2;

public class Book {
    String title;
    String author;

    Book(String someTitle, String someAuthor) {
        this.title = someTitle;
        this.author = someAuthor;
    }
    //setter sets a value and it doesn't return any
    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void printInfo() {
        System.out.println("The title: " + this.title + " The author: " + this.author);
    }
}
