package com.twu.biblioteca;


import java.util.Scanner;

public class BibliotecaApp {


    public static void main(String[] args) {


        System.out.println("Welcome to Biblioteca. Your one-step-shop for great book titles in Bangalore!");
        openMenu();


    }

    public static String[][] getList() {
        BookLists bookList = new BookLists();
        return bookList.getBookList();
    }

    public static void printBookList(String[][] str){
        System.out.println("Books We Have:");

        for (String[] oneBook : str) {
            System.out.println(oneBook[0]);
            for (int j = 1; j < oneBook.length; j++) {
                System.out.println("(" + oneBook[j] + ")");
            }
        }
    }

    public static String[] getOptions(){
        Menu menu = new Menu();
        return menu.getMenu();
    }

    public static void printOptions(){
        String[] opts = getOptions();
        for (String opt : opts){
            System.out.println(opt);
        }
    }

    public static String[][] getBookListFromMenu(int userInput){
        String[][] bookList = new String[][]{};
        if (userInput == 1){
            bookList = getList();
        }
        return bookList;
    }
    public static void openMenu() {

        Scanner scanner = new Scanner(System.in);


        while(true){
            printOptions();
            int input = scanner.nextInt();
            if (input == 1){
                String[][] result = getBookListFromMenu(1);
                printBookList(result);
                break;
            }
            if (input == 0){
                System.out.println("See you");
                break;
            } else{
                System.out.println("Please choose a valid option!");
            }
        }





    }



}
