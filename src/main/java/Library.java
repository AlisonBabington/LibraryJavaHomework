import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Books> libraryList;
    private HashMap<String, Integer> genreTracker;
    private int maxBooks;

    public Library(int maxBooks) {
        this.libraryList = new ArrayList<>();
        this.genreTracker = new HashMap<>();
        this.maxBooks = maxBooks;
    }

    public int countBooks() {
        return libraryList.size();
    }


    public void addBook(Books book) {
        if (libraryList.size() < maxBooks) {
            libraryList.add(book);
            checkGenre(book);
            return;
        }
        return;
    }

    public void checkGenre(Books book) {
        String genre = book.getGenre();
        if (genreTracker.containsKey(genre)) {
           Integer number = genreTracker.get(genre);
           genreTracker.put(genre, number + 1);
           return;
        }
        genreTracker.put(genre, 1);
    }

    public Books removeBook() {
        return libraryList.remove(0);
    }

    public int checkGenreNumber(Books book) {
        String genre = book.getGenre();
        return genreTracker.get(genre);
    }
}
