package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.Author;
import is.hi.hbv202g.ass8.Book;
import is.hi.hbv202g.ass8.EmptyAuthorListException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private String title = "TITLE";
    private String authorName = "AUTHOR_NAME";
    private Author author;
    private List<Author> authors;
    private Book book;

    @Before
    public void setUp() throws EmptyAuthorListException {
        author = new Author(authorName);
        authors = new ArrayList<>();
        authors.add(author);
        book = new Book(title, authors);
    }

    @Test
    public void TestBookTitle() {
        assertEquals(title, book.getTitle());
    }
    @Test
    public void testGetAuthors(){
        assertEquals(authors, book.getAuthors());
    }

}