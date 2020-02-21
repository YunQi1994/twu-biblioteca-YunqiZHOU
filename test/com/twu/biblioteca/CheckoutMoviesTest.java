package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CheckoutMoviesTest {
    private Checkout checkoutMovies;
    private Movies movies;

    @Before
    public void setUp(){
        movies = new Movies();
        checkoutMovies = new CheckoutMovies(movies);

    }

    @Test
    public void shouldCheckoutAMovieAsBorrowedAfterCheckout() {
        String movieTitle = "movie2";
        checkoutMovies.checkOut(movieTitle);

        assertEquals("borrowed",movies.getMovies()[1][4]);
    }
}