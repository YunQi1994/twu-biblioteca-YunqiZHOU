package com.twu.biblioteca;


import java.util.Scanner;

public class BibliotecaApp {

    private static BookLists bookLists = new BookLists();
    private static Movies movies = new Movies();
    public static void main(String[] args) {


        System.out.println("Welcome to Biblioteca. Your one-step-shop for great book titles in Bangalore!");
        while (true){
            System.out.println("Please Login");
            User user = new User();
            Scanner scanner = new Scanner(System.in);
            System.out.println("User Name: (your uniqe user ID)");
            String input = scanner.next();

            if (user.isUserExist(input)){
                System.out.println("Password: ");
                String password = scanner.next();
                if (user.isUserNameAndPasswordCorrect(input,password)){
                    user.userLogin(input,password);
                    System.out.println("Hello! " + input);
                    break;
                }
                else{
                    System.out.println("Sorry, the password is not correct\n");
                }
            }
        }
        openMenu();

    }

    public static void printList(String[][] str){
        for (String[] one : str) {
            System.out.println("---"+one[0]+"---");
            for (int j = 1; j < one.length; j++) {
                System.out.println("(" + one[j] + ")");
            }
        }
    }

    // legacy code for print books and movies
/*    public static void printBookList(String[][] str){

        for (String[] oneBook : str) {
            System.out.println("---"+oneBook[0]+"---");
            for (int j = 1; j < oneBook.length; j++) {
                System.out.println("(" + oneBook[j] + ")");
            }
        }
    }

    public static void printMovieList(String[][] str){

        for (String[] oneMovie : str) {
            System.out.println("---"+oneMovie[0]+"---");
            for (int j = 1; j < oneMovie.length; j++) {
                System.out.println("(" + oneMovie[j] + ")");
            }
        }
    }*/


    public static String[] getOptions(){
        Menu menu = new Menu();
        return menu.getMenu();
    }

    public static void printOptions(){
        String[] opts = getOptions();
        System.out.println(">>> Please enter an option: <<<");
        for (String opt : opts){
            System.out.println(opt);
        }
    }

    public static String[][] getListOfResource(int userInput){
        String[][] list = new String[][]{};
        if (userInput == 1){
            list = bookLists.getBookList();
        }
        if (userInput == 4){
            list = movies.getMovies();
        }
        return list;
    }


    // legacy get books and movies methods
/*    public static String[][] getBookListFromMenu(int userInput){
        String[][] bookList = new String[][]{};
        if (userInput == 1){
            bookList = bookLists.getBookList();
        }
        return bookList;
    }

    public static String[][] getMoviesFromMenu(int userInput){
        String[][] moviesList = new String[][]{};
        if (userInput == 4){
            moviesList = movies.getMovies();
        }
        return moviesList;
    }*/

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
                        System.out.println("See You");
                        quit = true;
                        break;
                    case '1'://see booklist
                        System.out.println("Books We Have:\n");
                        String[][] result = getListOfResource(1);
                        printList(result);
                        break;

                    case '2'://checkout a book
                        System.out.println("Please enter the title of a book to checkout:");
                        String checkouBookInput = scanner.next();
                        // check availability
                        if (bookLists.isAvailable(checkouBookInput)){
                            bookLists.checkOutABook(checkouBookInput);
                            System.out.println("<<"+checkouBookInput+">>"+"\nchecked out successfully\nThank you, enjoy the book\n\n");
                        }else
                        {
                            System.out.println("Sorry, that book is not available\n\n");
                        }
                        break;

                    case '3': //return A book
                        System.out.println("Please enter the title of a book to return:");
                        String returnInput = scanner.next();
                        bookLists.returnABook(returnInput);
                        // check book first
                        if (bookLists.doesTheBookBelongToTheLibrary(returnInput)){
                            System.out.println("Thank you for returning the book");
                        }
                        else {
                            System.out.println("This is not a valid book to return\n\n");
                        }
                        break;

                    case '4': //see movielist
                        System.out.println("Movies we have:\n");
                        String[][] moviesList = getListOfResource(4);
                        printList(moviesList);
                        break;
                    case '5': //checkout A moive
                        System.out.println("Please enter the name of movie to checkout:");
                        String checkoutMoiveInput = scanner.next();
                        if (movies.isAvailable(checkoutMoiveInput)){
                            movies.checkoutAMovie(checkoutMoiveInput);
                            System.out.println("<<"+checkoutMoiveInput+">>"+"\nchecked out successfully\nThank you, enjoy the movie\n\n");
                        }
                        else{
                            System.out.println("Sorry, that movie is not available\n\n");
                        }
                        break;

                    default:
                        System.out.println("Please choose a valid option!\n\n");
                        break;
                }
            }
            else{
                System.out.println("Please choose a valid option!\n\n");
            }


        }





    }



}
