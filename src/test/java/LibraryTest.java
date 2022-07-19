import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


        private Library library;
        private Book book;

        @Before
        public void before(){
            library = new Library(5);
            book = new Book("Colour of Magic", "Terry Pratchett", "Fantasy");
        }

        @Test
        public void canAddBook(){
            library.addBook(book);
            assertEquals(1, library.bookCount());
        }

        @Test
        public void LibraryStartsEmpty(){
            assertEquals(0, library.bookCount());
        }


        @Test
        public void canRemoveBook(){
            library.addBook(book);
            library.removeBook();
            assertEquals(0, library.bookCount());
        }



        @Test
        public void cantTakeMoreThanCapacity(){
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            assertEquals(5, library.bookCount());
    }
    }
