package workbook.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStorage {
    private ArrayList<String> books;

    public BookStorage() {
        this.books = new ArrayList<>();
    }

    private void addBook(String book) {
        books.add(book);
    }

    //a method for printing the list of the books
    public void printBooksList() {
        //if the list is empty
        if (books.isEmpty()) {
            //print this text
            System.out.println("The list of books is empty");
            //otherwise (= if the list is not empty)
        } else {
            //print this text and
            System.out.println("Books' list: ");
            //iterate through the collection
            //INITIALIZATION: i is a variable for storing an index of an item of collection (=book)
            //LOOP CONDITION: (while the condition is true) i should be less than the size of the collection
            //because we can not print books more than the collection has
            //INCREMENT: after each pass through the loop we increase i by one to go to the next book
            for (int i = 0; i < books.size(); i++) {
                //for each book we print: i + 1 = the number of the entry (0 + 1 = 1, 1 + 1 = 2 etc)
                //then a dot
                //then we address the collection and get the book by index
                System.out.println((i + 1) + "." + books.get(i));
            }
        }
    }

    //method for reading a book name from the console
    public void getBookFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a book's name (for exit type 'exit': ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            addBook(input);
        }
    }
}