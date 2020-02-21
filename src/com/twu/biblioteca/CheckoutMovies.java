package com.twu.biblioteca;

public class CheckoutMovies implements Checkout {
    private Movies movies;

    public CheckoutMovies(Movies movies){
        this.movies = movies;
    }
    @Override
    public void checkOut(String movieTitle) {
        String[][] movieList = movies.getMovies();
        for (int i = 0; i<movieList.length; i++){
            if (movieTitle.equals(movieList[i][0])){
                // check as borrowed
                movieList[i][4] = "borrowed";
            }
        }
    }
}
