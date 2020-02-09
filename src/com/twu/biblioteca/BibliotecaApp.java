package com.twu.biblioteca;

public class BibliotecaApp {


    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca. Your one-step-shop for great book titles in Bangalore!");
        printBookList();
    }

    public static String[][] getList() {
        BookLists bookList = new BookLists();
        return bookList.getBookList();
    }
    public static void printBookList(){
        String[][] str = getList();
        System.out.println("Books We Have:");

        for (String[] oneBook : str) {
            System.out.println(oneBook[0]);
            for (int j = 1; j < oneBook.length; j++) {
                System.out.println("(" + oneBook[j] + ")");
            }
        }
    }

    public static String getOption(int userInput){
        Menu menu = new Menu();
        String[] options = menu.getMenu();
        return options[userInput-1];
    }



}
