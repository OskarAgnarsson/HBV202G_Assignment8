package is.hi.hbv202g.ass8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private List<Lendable> lendables;
    private List<Lending> lendings;
    private List<User> users;

    public LibrarySystem() {
        lendables = new ArrayList<>();
        lendings = new ArrayList<>();
        users = new ArrayList<>();
    }
    public void setDefaultBooks() throws EmptyAuthorListException {
       Author suzanne =  new Author("Suzanne Collins");
       List<Author> hungergamesauthor = new ArrayList<Author>();
       hungergamesauthor.add(suzanne);
       lendables.add(new Book("The Hunger Games", hungergamesauthor));
       lendables.add(new Book("The Hunger Games: Mockingjay", hungergamesauthor));
       lendables.add(new Book("The Hunger Games: Cathing Fire", hungergamesauthor));

       Author jkrowling = new Author("J.K Rowling");
       List<Author> harrypotterauthor = new ArrayList<Author>();
       harrypotterauthor.add(jkrowling);
       lendables.add(new Book("Harry Potter and the Philosopher's Stone", harrypotterauthor));
       lendables.add(new Book("Harry Potter and the Chamber of Secrets", harrypotterauthor));
    }

    public void addLendable(String title, List<Author> authorList) throws EmptyAuthorListException{
        if (authorList.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        Lendable lendable = new Book(title, authorList);
        lendables.add(lendable);
    }

    public void addStudentUser(String name, boolean feePaid) {
        User user = new Student(name, feePaid);
        users.add(user);
    }

    public void addFacultyMemberUser(String name, String department) {
        User user = new FacultyMember(name, department);
        users.add(user);
    }

    public Lendable findLendableByTitle(String title) throws UserOrLendableDoesNotExistException{
        for (Lendable lendable : lendables) {
            if (lendable.getTitle().equals(title)) {
                return lendable;
            }
        }
        throw new UserOrLendableDoesNotExistException("Book does not exist");
    }

    public User findUserByName(String name) throws UserOrLendableDoesNotExistException {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new UserOrLendableDoesNotExistException("User does not exist");
    }

    public void borrowLendable(User user, Lendable lendable) {
        Lending lending = new Lending(lendable, user);
        lendings.add(lending);
    }

    public void extendLending(Lendable lendable, LocalDate newDueDate) {
        for(Lending e: lendings){
            if (e.getLendable() == lendable){
                e.setDueDate(newDueDate);
            }
        }
    }

    public void returnLendable(User user, Lendable lendable) {
        int cnt = 0;
        for(Lending e : lendings){
            if (e.getLendable() == lendable){
                break;
            }
            cnt++;
        }
        lendings.remove(cnt);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Lending> getLendings() {
        return lendings;
    }

    public List<Lendable> getLendables() {
        return lendables;
    }
}
