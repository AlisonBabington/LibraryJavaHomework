import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Books> borrowedBooks;
    private int maxBooks;

    public Borrower(String name, int maxBooks) {
        this.name = name;
        this.maxBooks = maxBooks;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void borrowBook(Library library) {
        if (maxBooks > borrowedBooks.size()) {
            Books book = library.removeBook();
            borrowedBooks.add(book);
            return;
        }
        return;
    }

    public int getBorrowedBookSize() {
        return borrowedBooks.size();
    }
}
