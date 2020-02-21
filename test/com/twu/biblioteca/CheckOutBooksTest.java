package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckOutBooksTest {
    private Checkout checkoutBooks;
    private BookLists bookLists;

    @Before
    public void setUp(){
        bookLists = new BookLists();
        checkoutBooks = new CheckOutBooks(bookLists);

    }

    @Test
    public void shouldCheckoutABookAsBorrowedAfterCheckout(){
        String bookTitle = "book3";
        checkoutBooks.checkOut(bookTitle);

        assertEquals("borrowed",bookLists.getBookList()[2][3]);
    }

}