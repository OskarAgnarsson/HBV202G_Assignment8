package is.hi.hbv202g.ass8;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Lendable {
    private List<Book> books;
    private String title;

    public BookCollection(List<Book> books, String title){
        this.books = books;
        this.title = title;
    }

    public BookCollection(String title) {
        this.books = new ArrayList<Book>();
        this.title = title;
    }

    public List<Book> getBooks(){
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public List<Author> getAuthors(){
        List<Author> authors = new ArrayList<Author>();
        for(Book e: books){
            authors.addAll(e.getAuthors());
        }
        return authors;
    }
    public String getTitle(){
        return title;
    }
}
