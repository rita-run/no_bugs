package homework_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    Library(String bookTitle, String author, int year, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    String getBookTitle() {
        return this.bookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    int getYear() {
        return this.year;
    }

    String getCategory() {
        return this.category;
    }

    void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void setCategory(String newCategory) {
        this.category = newCategory;
    }

}
