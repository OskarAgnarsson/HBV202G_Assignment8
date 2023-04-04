package is.hi.hbv202g.ass8;

import java.time.LocalDate;

public class Lending {

    private Lendable lendable;
    private User user;
    private LocalDate dueDate;
    public Lending(Lendable lendable, User user) {
        this.lendable = lendable;
        this.user = user;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Lendable getLendable() {
        return lendable;
    }

    public void setLendable(Lendable lendable) {
        this.lendable = lendable;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
