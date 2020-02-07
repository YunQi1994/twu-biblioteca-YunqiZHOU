package com.twu.biblioteca;

import java.util.Arrays;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        System.out.println("Welcome to Biblioteca. Your one-step-shop for great book titles in Bangalore!");
        System.out.println("Books We Have:\n"+Arrays.toString(bibliotecaApp.getList()));

    }

    public String[] getList() {
        BookLists bookList = new BookLists();
        return bookList.getBookList();
    }

}
