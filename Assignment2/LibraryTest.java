class Book {
    private String title;
    private String author;
    private boolean issued;

    private static int totalIssuedBooks = 0; // Static counter for issued books

    // Constructor
    public Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        setIssued(issued); // use setter so counter updates correctly
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    // Setter for issued
    public void setIssued(boolean issued) {
        // If status changes from false -> true, increment counter
        if (!this.issued && issued) {
            totalIssuedBooks++;
        }
        // If status changes from true -> false, decrement counter
        else if (this.issued && !issued) {
            totalIssuedBooks--;
        }
        this.issued = issued;
    }

    // Static method to display total issued books
    public static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        System.out.println("Book1 issued? " + book1.isIssued());
        System.out.println("Book2 issued? " + book2.isIssued());
        System.out.println("Book3 issued? " + book3.isIssued());

        // Show total issued books
        Book.showTotalIssued();
    }
}
