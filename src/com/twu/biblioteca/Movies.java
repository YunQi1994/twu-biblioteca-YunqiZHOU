package com.twu.biblioteca;

public class Movies {
    private String[][] movieList = {
            {"movie1", "Director: Chen", "Year: 2010", "Rating: 9.0"},
            {"movie2", "Director: Kai", "Year: 2011", "Rating: 7.5"},
            {"movie3", "Director: Ge", "Year: 2012", "Rating: Unrated"}};


    public String[][] getMovies() {
        return movieList;
    }
}
