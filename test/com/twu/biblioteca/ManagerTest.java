package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ManagerTest {
    private BookLists bookLists = new BookLists();
    private Manager manager = new BookManager(bookLists);

    @Before
    public void setUp(){
    }
    @Test
    public void checkoutABook(){
        manager.performCheckout("book1");

        assertEquals("borrowed",bookLists.getBookList()[0][3]);
    }
    @Test
    public void returnABook(){
        manager.performReturn("book1");

        assertEquals("available", bookLists.getBookList()[0][3]);
    }
}
