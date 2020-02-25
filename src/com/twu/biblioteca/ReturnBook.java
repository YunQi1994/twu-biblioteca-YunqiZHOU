package com.twu.biblioteca;

public class ReturnBook implements Returns {
    private BookLists bookLists;

    public ReturnBook(BookLists bookLists){
        this.bookLists = bookLists;
    }
    @Override
    public void manageReturn(String args) {
        bookLists.returnABook(args);
    }
}
