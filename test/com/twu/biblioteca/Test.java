package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test {

    @Test
    public void shouldReturnAListOfBooksAfterWelcome(){
        // get book obj
        Books book = new Books();
        // get App obj
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        String[] expectBookList = book.getBookList();
        assertEquals(expectBookList, bibliotecaApp.getBooks());
    }

}
