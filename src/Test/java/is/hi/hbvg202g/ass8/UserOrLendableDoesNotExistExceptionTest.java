package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserOrLendableDoesNotExistExceptionTest {
    private LibrarySystem librarySystem;
    private String NAME_OF_LENDABLE = "Lendable";
    
    private boolean thrown;
    @Before
    public void setUp(){
        thrown = false;
    }
    @Test
    public void TestUserOrLendableDoesNotExistException(){
        try{
           librarySystem = new LibrarySystem();
           librarySystem.findLendableByTitle(NAME_OF_LENDABLE);

        }
        catch(UserOrLendableDoesNotExistException e){
            thrown = true;
        }
        assertTrue(thrown);
    }
}
