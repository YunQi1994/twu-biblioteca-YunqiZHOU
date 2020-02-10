package com.twu.biblioteca;


import java.util.Scanner;

public class BibliotecaApp {

    private static BookLists bookLists = new BookLists();
    public static void main(String[] args) {


        System.out.println("Welcome to Biblioteca. Your one-step-shop for great book titles in Bangalore!");
        openMenu();


    }

    public static String[][] getList() {
        return bookLists.getBookList();
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
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);


        while(!quit){
            printOptions();
            String input = scanner.next();
            if (input.length()==1){
                char opt = input.charAt(0);
                switch (opt){

                    case '0'://quit system
                        System.out.println("See you");
                        quit = true;
                        break;
                    case '1'://see booklist
                        String[][] result = getBookListFromMenu(1);
                        printBookList(result);
                        break;

                    case '2'://checkout a book
                        System.out.println("Please enter the title of a book to checkout:");
                        String strInput = scanner.next();

                        bookLists.checkOutABook(strInput);
                        break;
                    default:
                        System.out.println("Please choose a valid option!");
                        break;
                }
            }
            else{
                System.out.println("Please choose a valid option!");
            }


        }





    }



}
