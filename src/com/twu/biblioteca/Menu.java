package com.twu.biblioteca;

public class Menu {
    private String[] options = {
            "0. Exit",
            "1. List of Books",
            "",
            ""
    };

    public String[] getMenu(){
        return options;
    }
}
