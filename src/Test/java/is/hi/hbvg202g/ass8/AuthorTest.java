package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.Author;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {
    private Author author;

    public static final String nameofauthor = "NAME_OF_AUTHOR";

    @Before
    public void setup(){
        author = new Author(nameofauthor);
    }
    @Test
    public void getNameOfAuthor(){
        assertEquals("NAME_OF_AUTHOR", author.getAuthorName());
    }

}
