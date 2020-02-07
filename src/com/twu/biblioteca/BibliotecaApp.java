package com.twu.biblioteca;

import org.junit.Test;

import java.util.Arrays;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        String[][] str = bibliotecaApp.getList();
        System.out.println("Welcome to Biblioteca. Your one-step-shop for great book titles in Bangalore!");
        System.out.println("Books We Have:");
        for(int i = 0; i<str.length; i++ ){
            String[] oneBook = str[i];
            System.out.println(oneBook[0]);
            for(int j = 1; j<oneBook.length; j++){
                System.out.println(oneBook[j]);
            }
        }


    }

    public String[][] getList() {
        BookLists bookList = new BookLists();
        return bookList.getBookList();
    }

}
