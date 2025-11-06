package clean_code.homework.complexproblems.library;

public class BookProxy {
    private Book book;
    private String content = null;


    public BookProxy(Book book) {
        this.book = book;
    }

    public String getContent() {
        if (content == null) {
            content = book.getAuthor() + " " + book.getTitle() + " " + book.getDescription();
        }
        return content;
    }
}