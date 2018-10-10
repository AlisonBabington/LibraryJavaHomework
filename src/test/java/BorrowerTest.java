import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Books book;

      @Before
      public void before() {
        library = new Library(30);
        book = new Books("The Great Gatsby", "Fitzgerald", "Novel");
        borrower = new Borrower("Jim", 5);
      }

      @Test
      public void getName() {
        assertEquals("Jim", borrower.getName());
      }

      @Test
      public void getBooks() {
          library.addBook(book);
          library.addBook(book);
          library.addBook(book);
          borrower.borrowBook(library);
          borrower.borrowBook(library);
          assertEquals(2, borrower.getBorrowedBookSize());
      }
}
