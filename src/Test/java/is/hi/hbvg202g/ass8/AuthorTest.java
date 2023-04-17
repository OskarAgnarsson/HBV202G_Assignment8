package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.Author;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {
    private Author author;

    public static final String JOHN = "JOHN";

    @Before
    public void setup(){
        Author author = new Author(JOHN);
    }
    @Test
    public void getNameOfAuthor(){
        assertEquals(JOHN, author.getAuthorName());
    }

}
