import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Books book;
    Books book2;

    @Before
    public void before() {
        library = new Library(5);
        book = new Books("The Sellout", "Paul Beatty", "Satire");
        book2 = new Books("One", "Two", "Horror");
    }

    @Test
    public void addBooks() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void maxBooks() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.countBooks());
        library.addBook(book);
        assertEquals(5, library.countBooks());
    }

    @Test
    public void removeBooks() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
        library.removeBook();
        assertEquals(1, library.countBooks());
    }

    @Test
    public void checkGenreTracker() {
        library.addBook(book);
        assertEquals(1, library.checkGenreNumber(book));
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.checkGenreNumber(book));
        System.out.println(book2);
        library.addBook(book2);
        assertEquals(1, library.checkGenreNumber(book2));
    }
}


