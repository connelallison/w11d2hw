import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (this.bookCount() < this.capacity){
            this.books.add(book);
        }
    }

    public Book removeBook(Book book){
        if (this.books.remove(book)){
            return book;
        }
        return null;
    }

    public int genreCount(String genre){
        int i, c;
        for (i = 0, c = 0; i < this.bookCount(); i++){
            if (this.books.get(i).getGenre() == genre){
                c++;
            }
        }
        return c;
    }
}
