package com.twu.biblioteca;

public class Movies {
    private String[][] movieList = {
            {"movie1", "Director: Chen", "Year: 2010", "Rating: 9.0","available"},
            {"movie2", "Director: Kai", "Year: 2011", "Rating: 7.5","available"},
            {"movie3", "Director: Ge", "Year: 2012", "Rating: Unrated","available"}};


    public String[][] getMovies() {
        return movieList;
    }
}
