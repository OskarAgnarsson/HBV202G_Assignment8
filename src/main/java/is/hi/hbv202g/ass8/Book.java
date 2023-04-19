package is.hi.hbv202g.ass8;

import java.util.ArrayList;
import java.util.List;

public class Book implements Lendable {
    private String title;
    private List<Author> authors;

    public Book(String title, List<Author> authors) throws EmptyAuthorListException{
        this.title = title;
        if (authors.isEmpty()){
            throw new EmptyAuthorListException("Author list is empty");
        }
        this.authors = authors;
    }
    public void addAuthor(Author author){
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        if (authors.isEmpty()){
            throw new EmptyAuthorListException("Author list is empty");
        }
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

