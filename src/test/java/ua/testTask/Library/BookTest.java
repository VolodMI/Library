package ua.testTask.Library;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import ua.testTask.Library.models.Book;


public class BookTest {
    private Book book;

    @Before
    public void createNewBook() {
        book = new Book();
    }

    @Test
    public void bookIdShouldNotBeNull(){
        int i = book.getId();
        Assertions.assertNotNull(i);
    }
}
