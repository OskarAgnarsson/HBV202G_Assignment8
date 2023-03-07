package is.hi.hbv202g.ass8;

import java.time.LocalDate;

public class Lending {

    private Book book;
    private User user;

    private LocalDate dueDate;
    public Lending(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
