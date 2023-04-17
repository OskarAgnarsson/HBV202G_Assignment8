package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.Author;
import is.hi.hbv202g.ass8.Book;
import is.hi.hbv202g.ass8.EmptyAuthorListException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmptyAuthorListExceptionTest {
    private String NAME_OF_BOOK;
    private List<Author> EMPTY_LIST;
    private boolean thrown;
    private Book book;

    @Before
    public void setUp(){
        EMPTY_LIST = new ArrayList<Author>();
        thrown = false;
    }
    @Test
    public void TestEmptyAuthorListExceptionTest() throws EmptyAuthorListException {
        try{
            book = new Book(NAME_OF_BOOK, EMPTY_LIST);
        }
        catch(EmptyAuthorListException e){
            thrown = true;
        }
        assertTrue(thrown);
    }
}
