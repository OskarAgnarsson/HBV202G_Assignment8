package is.hi.hbvg202g.ass8;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AuthorTest.class, BookTest.class, FacultyMemberTest.class, EmptyAuthorListExceptionTest.class,
    BookCollectionTest.class, LendingTest.class, LibrarySystemTest.class, StudentTest.class,
        UserOrLendableDoesNotExistExceptionTest.class })
public class AllTests {

}
