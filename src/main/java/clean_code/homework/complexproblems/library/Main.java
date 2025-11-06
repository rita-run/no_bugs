package clean_code.homework.complexproblems.library;

public class Main {
    public static void main(String[] args) {
        Book book = new BookBuilder()
                .setTitle("Harry Potter")
                .setAuthor("J. K. Rowling")
                .setDescription("The novels chronicle the lives of a young wizard, " +
                        "Harry Potter and his friends, " +
                        "all of whom are students at Hogwarts School of Witchcraft and Wizardry")
                .build();

        BookProxy proxy = new BookProxy(book);
        String content = proxy.getContent();
        System.out.println("Content: " + content);
    }
}