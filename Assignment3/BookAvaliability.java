class Book {
    private int copiesAvailable;

    public void addCopies(int n) {
        copiesAvailable += n;
    }

    public void removeCopies(int n) {
        if (n <= copiesAvailable) {
            copiesAvailable -= n;
        } else {
            System.out.println("Not enough copies to remove");
        }
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}

public class BookAvaliability {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.addCopies(3);     // add 3 copies
        b1.removeCopies(1);  // remove 1 copy

        System.out.println("Copies available = " + b1.getCopiesAvailable());
    }
}
