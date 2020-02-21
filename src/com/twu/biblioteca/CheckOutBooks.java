package com.twu.biblioteca;

public class CheckOutBooks implements Checkout {
    private BookLists bookLists;
    public CheckOutBooks(BookLists bookLists){
        this.bookLists = bookLists;
    }


    @Override
    public void checkOut(String bookTitle) {
        String [][] bookList = bookLists.getBookList();
        for (int i = 0; i<bookList.length; i++){
            if (bookTitle.equals(bookList[i][0])){
                // check as borrowed
                bookList[i][3] = "borrowed";
            }
        }
    }
}
