package com.twu.biblioteca;

public class BookManager extends Manager {
    public BookManager(BookLists bookLists){
        checkout = new CheckOutBooks(bookLists);
        returns = new ReturnBook(bookLists);
    }

}
