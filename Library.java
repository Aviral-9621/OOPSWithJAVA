import java.util.*;
class Book {
    int bookId;
    String bookTitle;
    String author;
    boolean availabilityStatus;

    Book(int bookId, String bookTitle, String author, boolean availabilityStatus) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);

        if (availabilityStatus) {
            System.out.println("Availability: Available");
        } else {
            System.out.println("Availability: Not Available");
        }
    }
}

public class Library {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", "James Gosling", true);

        b1.displayBook();
    }
}

