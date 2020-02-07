package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    public void shouldReturnAListOfBooksAfterWelcome(){

        BookLists bookList = new BookLists();
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        String[] expectBookList = bookList.getBookList();
        assertEquals(expectBookList, bibliotecaApp.getList());
    }
}
