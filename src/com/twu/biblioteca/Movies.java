package com.twu.biblioteca;

public class Movies {
    private String[][] movieList = {
            {"movie1", "Director: Chen", "Year: 2010", "Rating: 9.0","available"},
            {"movie2", "Director: Kai", "Year: 2011", "Rating: 7.5","available"},
            {"movie3", "Director: Ge", "Year: 2012", "Rating: Unrated","available"}};


    public String[][] getMovies() {
        return movieList;
    }

    public void checkoutAMovie(String movieName) {
        for (int i = 0; i<movieList.length; i++){
            if (movieName.equals(movieList[i][0])){
                // check as borrowed
                movieList[i][4] = "borrowed";
            }
        }
    }

    public boolean isAvailable(String bookTitle) {
        // not available 或者无效输入都将为false
        boolean availability  = false;
        String[] bookTitles = new String[movieList.length];
        for (String[] str : movieList) {
            if (bookTitle.equals(str[0]) && "available".equals(str[4])) {
                availability = true;
                break;
            }

        }
        return availability;
    }


}
