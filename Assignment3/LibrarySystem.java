class Book {
    private int bookId;
    private String title;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

abstract class LibraryMember {
    protected String name;
    protected int memberId;
    protected int count = 0;   // how many references assigned so far

    public LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    abstract void borrowBook(Book book);
}

class StudentMember extends LibraryMember {
    private final int limit = 3;

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    void borrowBook(Book book) {
        if (count < limit) {
            count++; // book reference accepted
            System.out.println("Student " + name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Limit exceeded! Student can borrow only " + limit + " books.");
        }
    }
}

class FacultyMember extends LibraryMember {
    private final int limit = 5;

    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    void borrowBook(Book book) {
        if (count < limit) {
            count++;
            System.out.println("Faculty " + name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Limit exceeded! Faculty can borrow only " + limit + " books.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book java = new Book(101, "Java Programming");
        Book python = new Book(102, "Python Basics");
        Book ds = new Book(103, "Data Structures");
        Book ai = new Book(104, "AI Concepts");

        StudentMember s = new StudentMember(1, "Amit");
        FacultyMember f = new FacultyMember(2, "Prof. Singh");

        // Each call passes a reference
        s.borrowBook(java);
        s.borrowBook(python);
        s.borrowBook(ds);
        s.borrowBook(ai);  // 4th book → not allowed

        f.borrowBook(java);
        f.borrowBook(python);
        f.borrowBook(ds);
        f.borrowBook(ai);  // still within 5
    }
}
