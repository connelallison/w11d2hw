import java.util.ArrayList;

public class Lender {
    private ArrayList<Book> books;

    public Lender(){
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        if (book != null){
            this.books.add(book);
        }
    }

    public void borrowBook(Library library, Book book){
        this.addBook(library.removeBook(book));
    }
}
