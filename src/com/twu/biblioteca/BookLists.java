package com.twu.biblioteca;

import java.util.Arrays;

public class BookLists {
    private String[][] bookList = {
            {"book1", "Author: Hugh", "YearOfPub: 2001","available"},
            {"book2", "Author: Jack", "YearOfPub: 2002","available"},
            {"book3", "Author: Man", "YearOfPub: 2003","available"}};

    public String[][] getBookList() {
        return bookList;
    }

    public void checkOutABook(String bookTitle) {

        for (int i = 0; i<bookList.length; i++){
            if (bookTitle.equals(bookList[i][0])){
                // check as borrowed
                bookList[i][3] = "borrowed";
            }
        }
    }

    public boolean isAvailable(String bookTitle) {
        boolean availability  = false;
        String[] bookTitles = new String[bookList.length];
        for (String[] str : bookList) {
            if (bookTitle.equals(str[0]) && "available".equals(str[3])) {
                availability = true;
                break;
            }

        }
        return availability;
    }

    public void returnABook(String bookTitle) {
        for (int i = 0; i<bookList.length; i++){
            if (bookTitle.equals(bookList[i][0])){
                // check as available
                bookList[i][3] = "available";
            }
        }
    }


}
