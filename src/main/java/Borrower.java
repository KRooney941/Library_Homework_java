import java.util.ArrayList;

public class Borrower {


    private String name;
    private ArrayList<Book>borrowedBooks;

    public Borrower(String name){
        this.borrowedBooks = new ArrayList<Book>();
        this.name = name;
    }

    public int borrowedBookCount() {return borrowedBooks.size(); }
}
