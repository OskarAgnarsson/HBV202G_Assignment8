package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookCollectionTest {
    private Book book1;
    private String title1 = "TITLE1";
    private Book book2;
    private String title2 = "TITLE2";
    private List<Book> books = new ArrayList<>();
    private Author author1 = new Author("AUTHOR1_NAME");
    private Author author2 = new Author("AUTHOR2_NAME");
    private List<Author> authors1 = new ArrayList<>();
    private List<Author> authors2 = new ArrayList<>();
    private BookCollection bookCollection;
    private String nameOfBookCollection = "NAME_OF_BOOK_COLLECTION";
    @Before
    public  void setUp() throws EmptyAuthorListException {
        authors1.add(author1);
        authors2.add(author2);
        book1 = new Book(title1, authors1);
        book2 = new Book(title2, authors2);
        books.add(book1);
        bookCollection = new BookCollection(books,nameOfBookCollection);
    }
    @Test
    public void testAddBook(){
        bookCollection.addBook(book2);
        assertTrue(bookCollection.getBooks().contains(book2));

    }
    @Test
    public void testRemoveBook(){
        bookCollection.removeBook(book1);
        assertFalse(bookCollection.getBooks().contains(book1));
    }
    @Test
    public void testGetBooks(){
        assertEquals(books,bookCollection.getBooks());
    }
    @Test
    public void testGetNameOfBookCollection(){
        assertEquals(nameOfBookCollection,bookCollection.getTitle());
    }
    @Test
    public void testGetAuthors() {
        assertEquals(authors1,bookCollection.getAuthors());
    }
}

