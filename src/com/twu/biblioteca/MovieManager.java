package com.twu.biblioteca;

public class MovieManager extends Manager {
    public MovieManager(){
        checkout = new CheckoutMovies();
    }
}
