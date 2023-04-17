package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LendingTest {
    private Book book;
    private String title = "TITLE";
    private Author author = new Author("AUTHOR_NAME");
    private List<Author> authors = new ArrayList<>();
    private Student student;
    private boolean feePaid = true;
    private String studentName = "STUDENT_NAME";
    private LocalDate dueDate = LocalDate.now();
    private Lending lending;

    @Before
    public void setUp() throws EmptyAuthorListException {
        authors.add(author);
        book = new Book(title, authors);
        student = new Student(studentName,feePaid);
        lending = new Lending(book, student);
        lending.setDueDate(dueDate);

    }
    @Test
    public void testGetLendable(){
        assertEquals(book, lending.getLendable());
    }
    @Test
    public void testGetDueDate(){
        assertEquals(dueDate, lending.getDueDate());
    }

}
