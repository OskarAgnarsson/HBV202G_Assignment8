package is.hi.hbv202g.ass8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private List<Book> books;
    private List<Lending> lendings;
    private List<User> users;

    public LibrarySystem() {
        books = new ArrayList<>();
        lendings = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBookWithTitleAndAuthorList(String title, List<Author> authorList) throws EmptyAuthorListException{
        if (authorList.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        Book book = new Book(title, authorList);
        books.add(book);
    }

    public void addStudentUser(String name, boolean feePaid) {
        User user = new Student(name, feePaid);
        users.add(user);
    }

    public void addFacultyMemberUser(String name, String department) {
        User user = new FacultyMember(name, department);
        users.add(user);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public void borrowBook(User user, Book book) {
        Lending lending = new Lending(book, user);
        lendings.add(lending);
    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {
        return;
    }

    public void returnBook(User user, Book book) {
        return;
    }
}
