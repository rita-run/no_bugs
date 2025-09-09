package practice_9.library;

import practice_9.exceptions.BookNotFoundException;
import practice_9.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    //add a book
    //processing exceptions: if we add a book that is already in the library
    //then we will get an unchecked exceptions InvalidBookException
    public void addBook(Book book) throws InvalidBookException {
        if (books.indexOf(book) >= 0) {
            throw new InvalidBookException("Such a book is already exists in the library");
        } else {
            books.add(book);
        }
    }

    //search for a book
    //processing an exception: if we can't find a book
    //then we will get a checked exception BookNotFoundException
    public Book findBook(String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(book -> {
            if (book.getName() == name) {
                foundBook.set(book);
            }
        });

        if (foundBook.get() == null) {
            throw new BookNotFoundException("Book is not found" + name);
        }
        return foundBook.get();
    }


}
