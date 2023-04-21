package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

public class LibrarySystemTest {
    private Student student;
    private String nameofstudent = "NAME_OF_STUDENT";
    private boolean feePaid;
    private FacultyMember facultyMember;
    private String nameoffacultymember = "NAME_OF_FACULTYMEMBER";
    private String nameofdepartment = "DEPARTMENT";
    private Author author;
    private String nameofauthor = "NAME_OF_AUTHOR";
    private List<Author> authors;
    private Lending lending;
    private Book book;
    private String nameofbook = "NAME_OF_BOOK";

    private LibrarySystem librarySystem;
    @Before
    public void setUp(){
        librarySystem = new LibrarySystem();
    }
    @Test
    public void testAddStudentUser(){
        librarySystem.addStudentUser(nameofstudent, feePaid);
        assertTrue(librarySystem.getUsers().size() == 1);
    }
    @Test
    public void testAddFacultyMember(){
        librarySystem.addFacultyMemberUser(nameoffacultymember, nameofdepartment);
        assertTrue(librarySystem.getUsers().size() == 1);
    }
    @Test
    public void testFindLendable() throws EmptyAuthorListException, UserOrLendableDoesNotExistException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystem.addLendable(new Book(nameofbook, authors));
        assertTrue(librarySystem.getLendables().contains(librarySystem.findLendableByTitle(nameofbook)));
    }
    @Test
    public void testFindUserByName() throws UserOrLendableDoesNotExistException {
        librarySystem.addStudentUser(nameofstudent, feePaid);
        assertTrue(librarySystem.getUsers().contains(librarySystem.findUserByName(nameofstudent)));
    }
    @Test
    public void testAddLendable() throws EmptyAuthorListException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        Lendable lendable = librarySystem.addLendable(new Book(nameofbook, authors));
        assertTrue(librarySystem.getLendables().contains(lendable));
    }
    @Test
    public void testBorrowLendable() throws EmptyAuthorListException, UserOrLendableDoesNotExistException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystem.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystem.addLendable(new Book(nameofbook, authors));
        lending = librarySystem.borrowLendable(librarySystem.findUserByName(nameofstudent), lendable);
        assertTrue(librarySystem.getLendings().contains(lending));
    }
    @Test
    public void testReturnLendable() throws EmptyAuthorListException, UserOrLendableDoesNotExistException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystem.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystem.addLendable(new Book(nameofbook, authors));
        lending = librarySystem.borrowLendable(librarySystem.findUserByName(nameofstudent), lendable);
        librarySystem.returnLendable(librarySystem.findUserByName(nameofstudent), lendable);
        assertFalse(librarySystem.getLendings().contains(lending));
    }
    @Test
    public void testExtendLending() throws EmptyAuthorListException, UserOrLendableDoesNotExistException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystem.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystem.addLendable(new Book(nameofbook, authors));
        lending = librarySystem.borrowLendable(librarySystem.findUserByName(nameofstudent), lendable);
        lending.setDueDate(LocalDate.ofEpochDay(2007-3-12));
        librarySystem.extendLending(lendable,LocalDate.ofEpochDay(2027-3-12) );
        assertNotEquals(lending.getDueDate(), LocalDate.ofEpochDay(2007 - 3 - 12));
    }
    @Test
    public void testGetUsers(){
        User user = librarySystem.addStudentUser(nameofstudent, feePaid);
        assertTrue(librarySystem.getUsers().contains(user));
    }
    @Test
    public void testGetLendables() throws EmptyAuthorListException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        librarySystem.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystem.addLendable(new Book(nameofbook, authors));
        assertTrue(librarySystem.getLendables().contains(lendable));
    }
    @Test
    public void testGetLendings() throws EmptyAuthorListException {
        author = new Author(nameofauthor);
        authors = new ArrayList<>();
        authors.add(author);
        User user = librarySystem.addStudentUser(nameofstudent, feePaid);
        Lendable lendable = librarySystem.addLendable(new Book(nameofbook, authors));
        lending = librarySystem.borrowLendable(user, lendable);
        assertTrue(librarySystem.getLendings().contains(lending));
    }


}
