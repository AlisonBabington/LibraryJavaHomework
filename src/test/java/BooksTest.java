import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    Books books;

    @Before
    public void before() {
        books = new Books ("Lake Success", "Gary Schteyngart", "Satire");
    }

    @Test
    public void getTitle() {
        assertEquals("Lake Success", books.getTitle());
    }

    @Test
    public void getAuthor() {
        assertEquals("Gary Schteyngart", books.getAuthor());
    }

    @Test
    public void getGenre() {
        assertEquals("Satire", books.getGenre());
    }


}
