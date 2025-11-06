package clean_code.homework.complexproblems.library;

public class BookBuilder {
    private Book book;

    public BookBuilder() {
        this.book = new Book();
    }

    public BookBuilder setTitle(String title) {
        this.book.setTitle(title);
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.book.setAuthor(author);
        return this;
    }

    public BookBuilder setDescription(String description) {
        this.book.setDescription(description);
        return this;
    }

    public Book build() {
        return book;
    }
}