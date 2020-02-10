package com.twu.biblioteca;

public class Menu {
    private String[] options = {
            "0. Exit",
            "1. List of Books",
            "2. Checkout A Book",
            ""
    };

    public String[] getMenu(){
        return options;
    }
}
