package com.twu.biblioteca;

public class Menu {
    private String[] options = {
            "0. Exit",
            "1. List of Books",
            "2. Checkout A Book",
            "3. Return A Book",
            "4. List if Movies",
            "5. Checkout A Moive",
            "6. My Account"
    };

    public String[] getMenu(){
        return options;
    }
}
