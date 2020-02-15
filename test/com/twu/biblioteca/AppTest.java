package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static com.twu.biblioteca.BibliotecaApp.*;
import static org.junit.Assert.*;


public class AppTest {
    private BookLists bookLists;
    private Movies movies;
    private User user;

    @Before
    public void setUp(){
        bookLists = new BookLists();
        movies = new Movies();
        user = new User();
    }

    @Test
    public void shouldReturnAListOfBooksWhenUserInputIs1(){

        String[][] expectBookList = bookLists.getBookList();
        String[][] actualBoosList = getListOfResource(1);


        assertEquals(expectBookList, actualBoosList);
    }


    @Test
    public void shouldReturnOptionsAfterWelcome(){
        // get menu obj
        Menu menu = new Menu();
        // get list of options
        String[] options = menu.getMenu();
        assertEquals(options, getOptions());
    }

    @Test
    public void shouldRemoveABookFromLibraryWhenUserDoCheckOut(){

        String bookTitle = "book1";
        String[][] expect = {
                {"book1", "Author: Hugh", "YearOfPub: 2001", "borrowed"},
                {"book2", "Author: Jack", "YearOfPub: 2002", "available"},
                {"book3", "Author: Man", "YearOfPub: 2003", "available"}};
        //remove book1 from library
        bookLists.checkOutABook(bookTitle);
        //expecting book1 are removed from library
        String[][] actual = bookLists.getBookList();

        assertEquals(expect,actual);
    }

    @Test
    public void shouldReturnTrueWhenABookIsStillAvailableInLibrary(){
        String input = "book2";

        boolean actual = bookLists.isAvailable(input);

        assertTrue(actual);


    }
    @Test
    public void shouldReturnFalseWhenABookIsNotAvailable(){
        // checkout first
        String input = "book3";
        bookLists.checkOutABook(input);
        // the check the availability, should be false
        boolean actual = bookLists.isAvailable(input);

        assertFalse(actual);
    }

    @Test
    public void shouldTheBookBecomeAvailableAfterUserHasReturnedIt(){
        // checkout book1 first
        String input = "book1";
        bookLists.checkOutABook(input);
        // return book1
        bookLists.returnABook(input);
        // the check the availability, should be true
        boolean actual = bookLists.isAvailable(input);

        assertTrue(actual);

    }

    @Test

    public void shouldReturnFalseWhenTheBookIsNotBelongToTheLibrary(){
        String input = "book4";
        boolean actual = bookLists.doesTheBookBelongToTheLibrary(input);
        assertFalse(actual);
    }

    @Test
    public void shouldReturnAMovieListWhenUserEnter4(){
        String[][] expect = movies.getMovies();
        String[][] actual = getListOfResource(4);

        assertEquals(expect, actual);
    }

    @Test
    public void shouldChangeAvailabilityOfAMoiveAfterUserCheckout (){
        String[][] expect = {
                {"movie1", "Director: Chen", "Year: 2010", "Rating: 9.0","available"},
                {"movie2", "Director: Kai", "Year: 2011", "Rating: 7.5","borrowed"},
                {"movie3", "Director: Ge", "Year: 2012", "Rating: Unrated","available"}};
        movies.checkoutAMovie("movie2");
        String[][] actual = movies.getMovies();
        assertEquals(expect,actual);

    }

    @Test
    public void shouldReturnFalseWhenTheMovieIsNotAvailable (){
        // checkout first
        movies.checkoutAMovie("movie3");
        // the check the availability, should be false
        boolean actual = movies.isAvailable("movie3");

        assertFalse(actual);
    }

    @Test
    public void shouldLoginWhenUserEnterCorrectUserNameAndPassword (){
        String userName = "client2";
        String password = "asd456";
        boolean isLogin = false;
        // login
        user.userLogin(userName, password);
        // get user login status
        String actual = user.getUser("client2")[2];
        assertEquals("onLine", actual);
    }

    @Test
    public void shouldRecordCheckOuttatusAfterUserCheckouABook(){
        // check out first
        user.recordBookCheckout("book1","client3");
        assertEquals("<book1>", user.getUser("client3")[3]);
    }



}

