import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;

    private Library library;

    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Kieran");
        book = new Book("Colour of Magic", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void booksBorrowedStartsEmpty(){ assertEquals(0, borrower.borrowedBookCount());}
}
