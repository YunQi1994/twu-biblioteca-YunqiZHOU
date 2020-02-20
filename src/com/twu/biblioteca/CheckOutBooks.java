package com.twu.biblioteca;

public class CheckOutBooks implements Checkout {
    private String[][] bookList = new BookLists().getBookList();
    @Override
    public void checkOut(String bookTitle) {
        for (int i = 0; i<bookList.length; i++){
            if (bookTitle.equals(bookList[i][0])){
                // check as borrowed
                bookList[i][3] = "borrowed";
            }
        }
    }
}
